package ua.edu.ucu.apps.Delivery;
import java.util.List;
import ua.edu.ucu.apps.flower.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering items via DHL";
    }
}
