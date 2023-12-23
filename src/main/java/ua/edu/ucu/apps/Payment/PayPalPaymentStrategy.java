package ua.edu.ucu.apps.Payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}