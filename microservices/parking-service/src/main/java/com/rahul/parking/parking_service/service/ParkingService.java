package com.rahul.parking.parking_service.service;

import com.rahul.parking.parking_service.data_transfer_object.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ParkingService {
    private final RestTemplate restTemplate;

    public ParkingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //entry method
    public TicketResponse entry(EntryRequest request) {
        TicketResponse response = new TicketResponse();
        //basic validation of vehicle
        if(request==null ||  request.getVehicleType()==null ){
            response.setMessage("Invalid Vehicle entry type");
            return response;
        }

        //slot service call
        Vehicle vehicle = new Vehicle();
        vehicle.setvehicleNumber(request.getvehicleNumber());
        vehicle.setVehicleType(request.getVehicleType());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Vehicle> entity = new HttpEntity<>(vehicle, headers);

        SlotResponse slotResponse =
                restTemplate.postForObject(
                        "http://slot-service/slot/allocate",
                        entity,
                        SlotResponse.class
                );



        //checking slot status
        if(slotResponse==null){
            response.setMessage("Slot is already occupied.Please visit after sometimes.");
            return response;
        }

        //generate ticket
        response.setTicketId("TICKET ID : "+System.currentTimeMillis());
        response.setSlotId(slotResponse.getId());
        response.setParking(true);
        response.setMessage("Ticket had been generated.Please keep with you at the time of exit (failure of ticket costs 10 RS fine )");

        return response;
    }

    //exit method
    public TicketResponse  exit(ExitRequest request) {
        TicketResponse response = new TicketResponse();
        //basic validation
        if (request == null || request.getTicketId() == null || request.getSlotId() == null) {
           response.setMessage("Invalid Request");
           response.setParking(true);
           return response;
        }

        //calling payment service at the time of exit
        PaymentResponse paymentResponse =
                restTemplate.postForObject(
                        "http://pricing-service/payment",
                        request,
                        PaymentResponse.class
                );

        //checking if payment was not done
        if (paymentResponse == null ||  !paymentResponse.getPaymentStatus()) {
            response.setMessage("Payment failed.vehicle not allowed to exit.");
            response.setParking(true);
            return response;
        }

        //releasing the allocated slot after exit
        Slot slot = new Slot();
        slot.setId(request.getSlotId());

         restTemplate.postForObject(
                "http://slot-service/slot/release",
                slot,
                String.class
        );
        response.setParking(false);
        response.setTicketId(request.getTicketId());
        response.setSlotId(request.getSlotId());
        response.setMessage("vehicle exited successfully");
        return response;
    }


}
