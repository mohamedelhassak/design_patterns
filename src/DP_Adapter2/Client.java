package DP_Adapter2;

import DP_Adapter2.existed_code.Xpay;
import DP_Adapter2.existed_code.XpayImpl;
import DP_Adapter2.new_code.PayD;

public class Client {

    public static void main(String[] args) {

        // Object for Xpay
        Xpay xpay = new XpayImpl();

        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("el hassak mohamed");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("2025");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);

        // set adapter
        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);

    }


    private static void testPayD(PayD payD) {

        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }

}
