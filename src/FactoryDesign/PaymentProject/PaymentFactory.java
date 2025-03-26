package FactoryDesign.PaymentProject;

public class PaymentFactory
{
    public PaymentProcessor getInstance(String paymentType)
    {
        if(paymentType.equalsIgnoreCase("UPI"))
        {
            return new UPIPayment();
        } else if (paymentType.equalsIgnoreCase("PayPal")) {
            return new PayPalPayment();
        }
        else {
            return new CreditCardPayment();
        }
    }
}
