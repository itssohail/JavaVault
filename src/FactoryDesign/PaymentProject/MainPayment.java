package FactoryDesign.PaymentProject;

public class MainPayment
{
    public static void main(String[] args) {
        PaymentFactory object = new PaymentFactory();
        PaymentProcessor payment = object.getInstance("UPI");
        payment.processPayment(500);
    }
}
