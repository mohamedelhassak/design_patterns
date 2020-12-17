package DP_Decorator2.forms;

public class Caree extends Forme {
    public Caree() {
        this.nom = "caree";
    }

    @Override
    public void dessiner() {
        System.out.print(" Je dessine un " + nom + " ");
    }
}
