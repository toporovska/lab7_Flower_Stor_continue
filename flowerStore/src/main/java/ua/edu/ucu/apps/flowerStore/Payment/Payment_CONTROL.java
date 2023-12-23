package ua.edu.ucu.apps.flowerStore.Payment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class Payment_CONTROL {
    @GetMapping("/payment")
    public String getDeliveryStrategies() {
        return "Ways of payment " + List.of(
            CreditCardPaymentStrategy.class,
            PayPalPaymentStrategy.class);
    }

}
