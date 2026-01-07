package com.rahul.parking.pricing_service.controller;

import com.rahul.parking.pricing_service.data_transfer_object.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import com.rahul.parking.pricing_service.service.PricingService;

@RestController
@Tag(name="Pricing Service",description = "Pricing related API")
public class PricingController {
    private final PricingService pricingService;

    public PricingController(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    @Operation(
            summary = "perform payment for respective vehicle ",
            description = "handles payment based on vehicleType and hours it was parked"
    )
    @PostMapping("/payment")
    public Payment calculatePayment(@RequestBody PricingRequest request) {
        return pricingService.calculatePayment(request);
    }
}
