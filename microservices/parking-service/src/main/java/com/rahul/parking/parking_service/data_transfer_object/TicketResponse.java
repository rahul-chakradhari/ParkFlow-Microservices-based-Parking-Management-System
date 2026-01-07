package com.rahul.parking.parking_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;

public class TicketResponse {
    @Schema(
            description = "ticket response obj at the time of entry & exit at parking"
    )
    //variables
    private String ticketId;
    private String slotId;
    private boolean parking;
    private String message;

    //getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String  ticketId) {
        this.ticketId = ticketId;
    }
    public String getSlotId() {
        return slotId;
    }
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }
    public boolean isParking() {
        return parking;
    }
    public void setParking(boolean parking) {
        this.parking = parking;
    }


    //constructors
    public TicketResponse() {
    }

    public TicketResponse(String message,String slotId,boolean parking, String ticketId) {
        this.message = message;
        this.slotId = slotId;
        this.parking = parking;
        this.ticketId = ticketId;
    }

}
