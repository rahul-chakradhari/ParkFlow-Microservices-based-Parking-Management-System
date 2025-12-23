package service;

import data_transfer_object.EntryRequest;
import data_transfer_object.ExitRequest;
import data_transfer_object.TicketResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingService {


    @PostMapping("/entry")
    public TicketResponse entry(@RequestBody EntryRequest entryRequest) {
        //slot service call
        //pricing service call
        TicketResponse ticketResponse = new TicketResponse();
        ticketResponse.setTicketId("TICKET ID"+System.currentTimeMillis());
        ticketResponse.setMessage("Ticket had been generated");
        return ticketResponse;
    }

    @PostMapping("/exit")
    public String exit(@RequestBody ExitRequest exitRequest) {
        //pricing service call
        //releasing slot service
        //payment confirmation
        return "Payment done successfully . Thank you visit us again.";
    }

}
