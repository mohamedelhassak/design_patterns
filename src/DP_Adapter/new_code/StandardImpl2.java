package DP_Adapter.new_code;

public class StandardImpl2 implements StandardInterface {

	@Override
	public void operation(int n1, int n2) {
		System.out.println("*****************************");
		System.out.println("Implementation standard 2....");
		System.out.println("resultat : "+(n1 + n2));
	}

}
