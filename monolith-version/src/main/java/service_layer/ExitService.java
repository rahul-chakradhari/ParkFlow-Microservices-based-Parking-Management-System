package service_layer;

import data_transfer_object_layer.exit.*;
import domain_layer.*;

public class ExitService {
    public ExitResponse processExit(ExitRequest request) {
        ExitResponse response = new ExitResponse();

        //validating the respective ticket
        if(request.getTicketId()==null){
             response.setMessage("Ticket is unavailable so have to pay 10Rs extra ");
             response.setAmount(10);
             response.setSuccess(false);
             return response;
        }

        //calculating amount
        int  amount=calculateAmount(request.getTicketId());

        //if  client not pays money then their vehicle not allowed to go outside
        if(!request.getPaymentDone()){
            response.setMessage("Payment not done .Your aren't allowed to go outside with vehicle ");
            response.setSuccess(false);
            return response;
        }

        //releasing of slot
        SlotService slotservice=new SlotService();
        slotservice.releaseSlot(new Slot());

        // generate receipt
        response.setSuccess(true);
        response.setAmount(amount);
        response.setMessage("Your payment has been done.Entry is allowed");
        response.setReceiptId("RECEIPT"+System.currentTimeMillis());
        return response;

    }
    private int calculateAmount(String ticketId) {
        return 50;
    }

}
