package FactoryDesign.PaymentProject;

public class PayPalPayment implements PaymentProcessor
{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PAYPAL    payment of ₹" + amount);

    }
}
