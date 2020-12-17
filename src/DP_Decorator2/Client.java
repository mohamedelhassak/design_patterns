package DP_Decorator2;

import DP_Decorator.boissons.Boisson;
import DP_Decorator.boissons.Espresso;
import DP_Decorator.decorators.Chocollat;
import DP_Decorator.decorators.Vanille;
import DP_Decorator2.decorators.FormeDeAgrandir;
import DP_Decorator2.decorators.FormeDeColeur;
import DP_Decorator2.decorators.FormeDeDeplacer;
import DP_Decorator2.forms.Circle;
import DP_Decorator2.forms.Forme;

public class Client {
    public static void main(String[] args) {

        System.out.println("*******************");
        System.out.println("*  Creer Circle   *");
        System.out.println("*******************");
        Forme circle = new Circle();
        System.out.println();

        circle.dessiner();

        circle = new FormeDeColeur(circle);
        circle.dessiner();

        circle = new FormeDeAgrandir(circle);
//        circle.se
        circle.dessiner();

        circle = new FormeDeDeplacer(circle);
        circle.dessiner();

        circle = new FormeDeAgrandir(circle);
        circle.dessiner();



    }
}
