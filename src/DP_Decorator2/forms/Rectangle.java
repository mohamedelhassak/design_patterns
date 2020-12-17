package DP_Decorator2.forms;

public class Rectangle extends Forme {
    public Rectangle() {
        this.nom = "rectangle";
    }

    @Override
    public void dessiner() {
        System.out.print("Je dessine un " + nom + " ");
    }
}
