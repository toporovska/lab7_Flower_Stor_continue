package ua.edu.ucu.apps.flowerStore;

import java.util.LinkedList;

import lombok.ToString;
import ua.edu.ucu.apps.flowerStore.Delivery;
import ua.edu.ucu.apps.flowerStore.Payment;
import ua.edu.ucu.apps.flowerStore.flower;

@ToString
public class Order {
    private LinkedList<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment selectedpayment) {
        this.payment = selectedpayment;
    }
    public void setDeliveryStrategy(Delivery selecteddelivery) {
        this.delivery = selecteddelivery;
    }
    public void calculateTotalPrice() {
        double totalPrice = items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
        System.out.println("Total price: " + totalPrice);
    }

    public void processOrder() {
        System.out.println("Processing the order");
        payment.pay(getTotalPrice());
        delivery.deliver(items);
    }
    
    public double getTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
