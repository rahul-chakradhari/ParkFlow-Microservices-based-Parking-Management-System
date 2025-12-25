package controller;

import data_transfer_object.Payment;
import data_transfer_object.Vehicle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.PricingService;

@RestController
public class PricingController {
    private final PricingService pricingService;

    public PricingController(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    @PostMapping("/payment")
    public Payment calculatePayment(@RequestBody Vehicle vehicle) {
        return pricingService.pricingService(vehicle);
    }
}
