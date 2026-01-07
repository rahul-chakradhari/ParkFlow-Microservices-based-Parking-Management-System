package com.rahul.parking.user_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;

public class EntryResponse {

    @Schema(
            description = "response obj returned after user entry"
    )
    //variables
    private String ticketId;
    private String slotId;
    private String message;
    private boolean isParking;

    //getters and setters
    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isParking() {
        return isParking;
    }
    public void setParking(boolean parking) {
        isParking = parking;
    }

    //constructors
    public EntryResponse() {
    }

    public EntryResponse(String message, String slotId, String ticketId, boolean isParking) {
        this.message = message;
        this.slotId = slotId;
        this.ticketId = ticketId;
        this.isParking = isParking;
    }

}