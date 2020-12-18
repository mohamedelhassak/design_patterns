package Structural_Patterns.DP_Decorator.boissons;

public class Espresso extends Boisson {
    public Espresso() {
        this.desc = "Espresso";
    }

    @Override
    public double cout() {
        return 6;
    }
}
