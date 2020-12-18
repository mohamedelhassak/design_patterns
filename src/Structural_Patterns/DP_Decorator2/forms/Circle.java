package Structural_Patterns.DP_Decorator2.forms;

public class Circle extends Forme {
    public Circle() {
        this.nom = "circle";
    }

    @Override
    public void dessiner() {
        System.out.print(" Je dessine un " + nom + " ");
    }
}
