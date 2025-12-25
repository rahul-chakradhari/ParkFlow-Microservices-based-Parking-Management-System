<<<<<<< HEAD
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
=======
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
>>>>>>> 9780f22bce0d570e8526a7f6ef38dc2af128417f
