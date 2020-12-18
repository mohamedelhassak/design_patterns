package Structural_Patterns.DP_Adapter;

import Structural_Patterns.DP_Adapter.new_code.StandardImpl;
import Structural_Patterns.DP_Adapter.new_code.StandardImpl2;

public class App {

    public static void main(String[] args) {
        Client client = new Client();

        client.setStd(new StandardImpl());
        client.process(5, 5);

        client.setStd(new StandardImpl2());
        client.process(5, 5);

        //utilser adapter
        client.setStd(new Adapter());
        client.process(5, 5);

    }

}
