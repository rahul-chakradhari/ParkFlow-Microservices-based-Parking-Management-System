package com.rahul.parking.pricing_service.service;

import com.rahul.parking.pricing_service.data_transfer_object.*;
import com.rahul.parking.pricing_service.enums.VehicleType;
import org.springframework.stereotype.Service;

@Service
public class PricingService {
    public Payment calculatePayment(PricingRequest request) {
        Payment payment = new Payment();

        double rate = 0;
        if (request.getVehicleType() == VehicleType.TWO_WHEELER) rate = 10;
        else if (request.getVehicleType() == VehicleType.THREE_WHEELER) rate = 20;
        else if (request.getVehicleType() == VehicleType.FOUR_WHEELER) rate = 30;

        double amount = rate * request.getHours();

        payment.setId("PAYMENT ID : " + System.currentTimeMillis());
        payment.setTicketId("TICKET ID : "+request.getTicketId());
        payment.setAmount(amount);
        payment.setPaymentStatus(true);

        return payment;
    }


}

