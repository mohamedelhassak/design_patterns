package DP_Decorator.decorators;

import DP_Decorator.boissons.Boisson;

public class Caramel extends DecoratorAbstract{
    public Caramel(Boisson b){
        super(b);
    }
    @Override
    public double cout() {
        return 0.9 + boisson.cout();
    }

    @Override
    public String getDesc() {
        return boisson.getDesc()+" Au caramel";
    }


}
