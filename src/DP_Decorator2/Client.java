package DP_Decorator2;

import DP_Decorator2.decorators.FormeDeAgrandir;
import DP_Decorator2.decorators.FormeDeColeur;
import DP_Decorator2.decorators.FormeDeDeplacer;
import DP_Decorator2.forms.Forme;

public class Client {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------");
        System.out.println("*  DESIGN PATTERN : DECORATOR + FACTORY BY --> EL HASSAK Mohamed *");
        System.out.println("------------------------------------------------------------------");

        System.out.println();

        System.out.println("*******************");
        System.out.println("*  Creer Circle   *");
        System.out.println("*******************");

        //craete objet de factory
        FormeFactory f = new FormeFactory();
        //create circle via Factory
        Forme circle = f.createForme(FormeFactory.TYPE_CIRCLE);


        circle.dessiner();

        circle = new FormeDeColeur(circle);
        circle.dessiner();

        circle = new FormeDeAgrandir(circle);
        circle.dessiner();

        circle = new FormeDeDeplacer(circle);
        circle.dessiner();

        circle = new FormeDeAgrandir(circle);
        circle.dessiner();

        System.out.println();
        System.out.println();

        System.out.println("*******************");
        System.out.println("* Creer Rectangle *");
        System.out.println("*******************");

        //create rectangle via Factory
        Forme rectangle = f.createForme(FormeFactory.TYPE_RECTANGLE);

        rectangle.dessiner();

        rectangle = new FormeDeAgrandir(rectangle);
        rectangle.dessiner();

        rectangle = new FormeDeColeur(rectangle);
        rectangle.dessiner();


        System.out.println();
        System.out.println();


    }
}
