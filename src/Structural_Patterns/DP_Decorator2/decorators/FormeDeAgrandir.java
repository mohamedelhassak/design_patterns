package Structural_Patterns.DP_Decorator2.decorators;

import Structural_Patterns.DP_Decorator2.forms.Forme;

public class FormeDeAgrandir extends FormeDecorator {
    private double nb = 2;

    public FormeDeAgrandir(Forme f) {
        super(f);
    }

    public void setNb(double nb) {
        this.nb = nb;
    }

    @Override
    public void dessiner() {
        System.out.print(", Agrandir avec : " + nb);
    }
}
