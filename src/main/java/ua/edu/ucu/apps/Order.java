package ua.edu.ucu.apps;
import lombok.*;
import java.util.LinkedList;

import ua.edu.ucu.apps.Delivery.Delivery;
import ua.edu.ucu.apps.Payment.Payment;
import ua.edu.ucu.apps.flower.Item;



@ToString
public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double TotalPrice() {
        double ans = 0;
        for (Item item : items) {
            ans += item.getPrice();
        }
        return ans;
    }

    public void processOrder() {
        System.out.println("Processing the order");
        payment.pay(TotalPrice());
        delivery.deliver(items);
    }
    

}
