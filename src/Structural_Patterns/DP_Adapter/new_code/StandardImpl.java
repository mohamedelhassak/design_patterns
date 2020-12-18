package Structural_Patterns.DP_Adapter.new_code;

public class StandardImpl implements StandardInterface {

    @Override
    public void operation(int n1, int n2) {
        System.out.println("*****************************");
        System.out.println("Implementation standard 1....");
        System.out.println("resultat : " + (n1 * n2));
    }

}
