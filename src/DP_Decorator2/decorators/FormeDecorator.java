package DP_Decorator2.decorators;

import DP_Decorator2.forms.Forme;

public abstract class FormeDecorator extends Forme {
    protected Forme forme;

    public FormeDecorator(Forme f) {
        super();
        this.forme = f;
    }

    public abstract void dessiner();
}
