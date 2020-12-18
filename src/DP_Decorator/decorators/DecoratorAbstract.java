package DP_Decorator.decorators;

import DP_Decorator.boissons.Boisson;

public abstract class DecoratorAbstract extends Boisson {
    protected Boisson boisson;

    public DecoratorAbstract(Boisson boisson) {
        super();
        this.boisson = boisson;
    }

    public abstract String getDesc();
}
