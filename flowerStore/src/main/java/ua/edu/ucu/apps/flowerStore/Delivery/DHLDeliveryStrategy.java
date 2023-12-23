package ua.edu.ucu.apps.flowerStore.Delivery;
import java.util.List;
import ua.edu.ucu.apps.flowerStore.flower.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering items via DHL";
    }
}
