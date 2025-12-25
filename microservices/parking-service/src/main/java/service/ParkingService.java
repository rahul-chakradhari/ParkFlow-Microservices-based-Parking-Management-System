package service;

import data_transfer_object.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ParkingService {
    private final RestTemplate restTemplate;
    public ParkingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public TicketResponse entry( EntryRequest request) {
        TicketResponse response = new TicketResponse();
        //basic validation of vehicle
        if(request==null ||  request.getVehicleType()==null ){
            response.setMessage("Invalid Vehicle entry type");
            return response;
        }
        //slot service call
        SlotResponse slotResponse=restTemplate.postForObject("http://localhost:8084/slot/allocate",request.getVehicleType(),SlotResponse.class);

        //checking slot status
        if(slotResponse==null){
            response.setMessage("Slot is already occupied.Please visit after sometimes.");
            return response;
        }

        //checking slot type based on vehicle
        if(slotResponse.getAvailableSlotType()==false){
            response.setMessage("Slot of the particular vehicle is not available.Please visit after sometimes.");
            return response;
        }

        //generate ticket
        response.setMessage("Ticket had been generated.Please keep with you at the time of exit (failure of ticket costs 10 RS fine )");
        response.setTicketId("TICKET"+System.currentTimeMillis());
        return response;
    }

    public String exit( ExitRequest request) {
        //basic validation
        if(request==null ||request.getTicketId()==null|| request.getSlotId()==null){
            return "Invalid Exit request";
        }

        //pricing service call
        PaymentResponse paymentResponse=restTemplate.postForObject("http://localhost:8085/payment",request,PaymentResponse.class);
        if(paymentResponse==null || !paymentResponse.getIsSuccess())return "Payment Failed.Vehicle isn't allowed to exit";

        //releasing slot service
        restTemplate.postForObject("http://localhost:8084/slot/release",request.getSlotId(),Boolean.class);
        return "Payment done successfully . Thank you visit us again.";
    }

}
