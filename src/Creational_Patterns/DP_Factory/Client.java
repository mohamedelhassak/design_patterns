package Creational_Patterns.DP_Factory;

public class Client {

    public static void main(String[] args) {

        ProductFactory pf = new ProductFactory();
        ProductInterface prod;
        prod = pf.createProduct("A");
        prod.writeName("John Doe");
        prod = pf.createProduct("B");
        prod.writeName("John Doe");
    }

}
