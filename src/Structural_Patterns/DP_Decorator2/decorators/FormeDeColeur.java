package Structural_Patterns.DP_Decorator2.decorators;

import Structural_Patterns.DP_Decorator2.forms.Forme;

public class FormeDeColeur extends FormeDecorator {
    private String color = "Red";

    public FormeDeColeur(Forme f) {
        super(f);
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void dessiner() {
        System.out.print(", Couleur : " + color);
    }
}
