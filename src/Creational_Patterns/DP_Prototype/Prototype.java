package Creational_Patterns.DP_Prototype;

import java.util.Hashtable;

public class Prototype {

    Hashtable<String, Product> productMap = new Hashtable<String, Product>();

    //get product from MapList and Clone it
    public Product getProduct(String productCode) {
        Product cachedProduct = (Product) productMap.get(productCode);
        return (Product) cachedProduct.clone();
    }


    //remplir map lit b des products
    public void loadCache() {
        //for each product run expensive query and instantiate
        // product productMap.put(productKey, product);
        // for exemplification, we add only two products
        Book b1 = new Book();
        b1.setDescription("Oliver Twist");
        b1.setSKU("B1");
        b1.setNumberOfPages(100);
        productMap.put(b1.getSKU(), b1);

        Book b2 = new Book();
        b2.setDescription("Oliver Twist");
        b2.setSKU("B2");
        b2.setNumberOfPages(100);
        productMap.put(b2.getSKU(), b2);


        DVD d1 = new DVD();
        d1.setDescription("Superman");
        d1.setSKU("D1");
        d1.setDuration(180);
        productMap.put(d1.getSKU(), d1);


    }
}
