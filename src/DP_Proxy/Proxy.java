package DP_Proxy;

import java.util.Random;

public class Proxy implements StandardInterface {

    private StandardInterfaceImpl1 target;

    @Override
    public void operation() {
        //proxy fait pour controler l'acces
        System.out.println("Verification des parametres du securite...");
        boolean b = new Random().nextBoolean();
        if (b) {
            target = new StandardInterfaceImpl1();
            target.operation();
        } else {
            System.out.println("Forbidden 403");
        }
    }
}
