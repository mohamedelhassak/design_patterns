package DP_Decorator2.decorators;

import DP_Decorator2.forms.Forme;

public class FormeDeDeplacer extends FormeDecorator {
    private double step = 2;

    public FormeDeDeplacer(Forme f) {
        super(f);
    }

    public void setStep(double step) {
        this.step = step;
    }

    @Override
    public void dessiner() {
        System.out.print(", Deplacer avec : " + step);
    }
}
