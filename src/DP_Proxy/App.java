package DP_Proxy;

public class App {
    public static void main(String[] args) {
        Client c = new Client();
        System.out.println("[START..WITHOUT USING PROXY...-----------]");
        c.setStandard(new StandardInterfaceImpl1());
        c.process();

        System.out.println();
        //utilser proxy
        System.out.println("[START..USING PROXY...-------------------]");
        c.setStandard(new Proxy());
        c.process();
    }
}
