package DP_Prototype;

public class Client {

	public static void main(String[] args) {
		
		Prototype pe = new Prototype();
		pe.loadCache();
		
		Book clonedBook, clonedBook2;
		DVD clonedDVD;
		try {
			clonedBook = (Book)pe.getProduct("B1");
			System.out.println("SKU = " + clonedBook.getSKU());
			System.out.println("SKU = " +clonedBook.getDescription());
			System.out.println("SKU = " +clonedBook.getNumberOfPages());
			
			System.out.println("---------------------------------------");

			clonedDVD = (DVD)pe.getProduct("D1");
			System.out.println("SKU = " + clonedDVD.getSKU());
			System.out.println("SKU = " + clonedDVD.getDescription());
			System.out.println("SKU = " + clonedDVD.getDuration());
			
			System.out.println("---------------------------------------");

			clonedBook2 = (Book)pe.getProduct("B2");
			System.out.println("SKU = " + clonedBook2.getSKU());
			System.out.println("SKU = " +clonedBook2.getDescription());
			System.out.println("SKU = " +clonedBook2.getNumberOfPages());
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
