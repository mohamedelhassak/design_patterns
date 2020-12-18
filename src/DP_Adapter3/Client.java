package DP_Adapter3;

import DP_Adapter3.new_code.FileManagerInterface;

public class Client {

    public static void main(String[] args) {

        FileManagerInterface f = new FileMangerImplAdapter();

        String dummyData = "dynamite";

        System.out.println("Using filemanager: " +
                f.getClass().toString());
        f.open("dummyfile.dat");
        f.write(0, dummyData.length(), dummyData.getBytes());
        String test = f.read(0, dummyData.length(),
                dummyData.getBytes());
        System.out.println("Data written and read: " + test);
        f.close();
    }

}
