package Structural_Patterns.DP_Decorator.boissons;

public abstract class Boisson {
    protected String desc;

    public abstract double cout();

    public String getDesc() {
        return desc;
    }
}
