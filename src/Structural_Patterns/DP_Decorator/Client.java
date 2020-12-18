package Structural_Patterns.DP_Decorator;

import Structural_Patterns.DP_Decorator.boissons.Boisson;
import Structural_Patterns.DP_Decorator.boissons.Espresso;
import Structural_Patterns.DP_Decorator.decorators.Chocollat;
import Structural_Patterns.DP_Decorator.decorators.Vanille;

public class Client {
    public static void main(String[] args) {
        Boisson b = new Espresso();

        System.out.println("*******************");
        System.out.println(b.getDesc());
        System.out.println(b.cout() + "DH");
        System.out.println("*******************");

        b = new Chocollat(b);
        System.out.println(b.getDesc());
        System.out.println(b.cout() + "DH");
        System.out.println("*******************");

        b = new Vanille(b);
        System.out.println(b.getDesc());
        System.out.println(b.cout() + "DH");
        System.out.println("*******************");
    }
}
