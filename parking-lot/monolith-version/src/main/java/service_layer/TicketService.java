package service_layer;

import domain_layer.*;

public class TicketService {

    public Ticket generateTicket(Slot slot){
        if(slot==null || !slot.getOccupied())return null;
        Ticket ticket = new Ticket();
        ticket.setId("TICKET"+System.currentTimeMillis());
        ticket.setSlotId(slot.getId());
        ticket.setTicketStatus(true);
        ticket.setEntryTime(String.valueOf(System.currentTimeMillis()));
        return ticket;
    }

}
