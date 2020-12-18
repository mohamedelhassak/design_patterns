package Structural_Patterns.DP_Adapter2.existed_code;

public interface Xpay {

    public String getCreditCardNo();

    public void setCreditCardNo(String creditCardNo);

    public String getCustomerName();

    public void setCustomerName(String customerName);

    public String getCardExpMonth();

    public void setCardExpMonth(String cardExpMonth);

    public String getCardExpYear();

    public void setCardExpYear(String cardExpYear);

    public Short getCardCVVNo();

    public void setCardCVVNo(Short cardCVVNo);

    public Double getAmount();

    public void setAmount(Double amount);
}