package Structural_Patterns.DP_Adapter;

import Structural_Patterns.DP_Adapter.existed_code.AncienneImpl;
import Structural_Patterns.DP_Adapter.new_code.StandardInterface;

public class Adapter extends AncienneImpl implements StandardInterface {

    //utilser composition
    //private AncienneInterface ancienne = new AncienneImpl();
//	@Override
//	public void operation(int n1, int n2) {
//		double res = ancienne.calcul(n1, n2);
//		ancienne.print(res);
//	}


    // utilser l'heritage
    @Override
    public void operation(int n1, int n2) {
        double res = super.calcul(n1, n2);
        super.print(res);
    }

}
