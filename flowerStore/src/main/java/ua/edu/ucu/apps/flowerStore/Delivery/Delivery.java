package ua.edu.ucu.apps.flowerStore.Delivery;
import ua.edu.ucu.apps.flowerStore.flower.Item;
import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
