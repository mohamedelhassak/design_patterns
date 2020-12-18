package DP_Decorator.decorators;

import DP_Decorator.boissons.Boisson;

public class Chocollat extends DecoratorAbstract {
    public Chocollat(Boisson b) {
        super(b);
    }

    @Override
    public double cout() {
        return 0.7 + boisson.cout();
    }

    @Override
    public String getDesc() {
        return boisson.getDesc() + " Au chocollat";
    }


}
