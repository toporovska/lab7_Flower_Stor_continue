package ua.edu.ucu.apps.flowerStore.Delivery;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/flower")
public class DeliveryController {
    
    @GetMapping("/delivery")
    public String getDeliveryStrategies() {
        return "Ways of delivery " 
            + List.of(PostDeliveryStrategy.class, DHLDeliveryStrategy.class);
    }
}
