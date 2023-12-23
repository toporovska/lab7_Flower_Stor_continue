package ua.edu.ucu.apps.flower;

import java.util.ArrayList;
import java.util.List;


public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
    public void add(FlowerPack flowerPack) {
        flowerPacks.add((flowerPack));
    }
}