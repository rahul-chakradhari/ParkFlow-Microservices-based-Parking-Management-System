package com.rahul.parking.pricing_service.controller;

import com.rahul.parking.pricing_service.data_transfer_object.*;
import org.springframework.web.bind.annotation.*;
import com.rahul.parking.pricing_service.service.PricingService;

@RestController
public class PricingController {
    private final PricingService pricingService;

    public PricingController(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    @PostMapping("/payment")
    public Payment calculatePayment(@RequestBody PricingRequest request) {
        return pricingService.calculatePayment(request);
    }
}
