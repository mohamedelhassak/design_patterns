package DP_Factory;

public class ProductFactory {

	ProductInterface createProduct(String type) {
		if(type.equals("B"))
			return new ProductB();
		else
			return new ProductA();
	}
}
