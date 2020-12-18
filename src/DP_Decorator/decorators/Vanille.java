package DP_Decorator.decorators;

import DP_Decorator.boissons.Boisson;

public class Vanille extends DecoratorAbstract {
    public Vanille(Boisson b) {
        super(b);
    }

    @Override
    public double cout() {
        return 0.4 + boisson.cout();
    }

    @Override
    public String getDesc() {
        return boisson.getDesc() + " Au vanille";
    }


}
