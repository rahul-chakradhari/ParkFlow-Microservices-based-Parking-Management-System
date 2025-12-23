package service;

import data_transfer_object.EntryRequest;
import data_transfer_object.EntryResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public  EntryResponse processEntry(EntryRequest request){
        EntryResponse response = new EntryResponse();

        //basic validation
        if(request==null || request.getVehicleType()==null){
            response.setMessage("Invalid entry request");
            return response;
        }
        //call slot service
        String slotId="SLOT-101";

        //call parking service
        String ticketId="TICKET"+System.currentTimeMillis();

        response.setSlotId(slotId);
        response.setTicketId(ticketId);
        response.setMessage("You can park your vehicle now");
        return response;
    }
}
