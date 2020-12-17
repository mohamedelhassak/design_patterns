package DP_Decorator.boissons;

public class Sumatra extends Boisson{
    public Sumatra(){
        this.desc="Sumatra";
    }
    @Override
    public double cout() {
        return 8;
    }
}
