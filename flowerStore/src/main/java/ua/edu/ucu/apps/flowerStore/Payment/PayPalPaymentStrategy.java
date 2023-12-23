package ua.edu.ucu.apps.flowerStore.Payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}