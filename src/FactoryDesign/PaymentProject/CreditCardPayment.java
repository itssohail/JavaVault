package FactoryDesign.PaymentProject;

public class CreditCardPayment implements PaymentProcessor
{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit card payment of ₹" + amount);

    }
}
