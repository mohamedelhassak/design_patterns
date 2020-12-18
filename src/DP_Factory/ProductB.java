package DP_Factory;

public class ProductB implements ProductInterface {

    public void writeName(String name) {
        StringBuilder tempName = new StringBuilder().append(name);
        System.out.println("My reversed name is" +
                tempName.reverse());
    }

}
