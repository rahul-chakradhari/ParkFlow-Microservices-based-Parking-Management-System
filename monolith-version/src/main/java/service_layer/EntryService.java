package service_layer;

import data_transfer_object_layer.entry.*;
import domain_layer.*;

public class EntryService {

    public EntryResponse processEntry(EntryRequest request) {
        EntryResponse response = new EntryResponse();

        //  validating the vehicle
        if (request==null || request.getVehicle() == null) {
            response.setMessage("vehicle entry mismatched");
            return response;
        }

        Vehicle vehicle = request.getVehicle();

        // checking slot available of that particular vehicle
        Slot slot = findAvailableSlot(vehicle);
        if (slot == null) {
            response.setMessage("slot not available");
            return response;
        }

        // matching the particular slot with respect to vehicle
        if (!slot.getVehicleType().equals(vehicle.getVehicleType())) {
            response.setMessage("slot type mismatch");
            return response;
        }

        // generating ticket
        Ticket ticket = generateTicket(slot);
        response.setTicketId(ticket.getId());
        response.setSlotId(slot.getId());
        response.setMessage("ticket generated successfully");
        return response;
    }

    private Slot findAvailableSlot(Vehicle vehicle) {
        boolean slotAvailable = true;
        if (!slotAvailable) {
            return null;
        }
        SlotService slotservice=new SlotService();
        Slot slot=slotservice.allocateSlot(vehicle);
        return slot;
    }

    private Ticket generateTicket(Slot slot) {
        Ticket ticket = new Ticket();
        ticket.setId("TICKET-" + System.currentTimeMillis());
        ticket.setSlotId(slot.getId());
        ticket.setTicketStatus(true);
        ticket.setEntryTime(String.valueOf(System.currentTimeMillis()));
        return ticket;
    }
}
