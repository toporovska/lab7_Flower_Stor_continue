package ua.edu.ucu.apps.flowerStore.flower;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class Flower_CONTROL {

    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(0.8, FlowerColor.GREEN, 45, FlowerType.ROSE)
        );
    }
}
