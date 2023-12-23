package ua.edu.ucu.apps.Payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}
