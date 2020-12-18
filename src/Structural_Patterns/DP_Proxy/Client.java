package Structural_Patterns.DP_Proxy;

public class Client {
    private StandardInterface standard;

    public void setStandard(StandardInterface standard) {
        this.standard = standard;
    }

    public void process() {
        standard.operation();
    }
}
