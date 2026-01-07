package com.rahul.parking.parking_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;

public class ExitRequest {

    @Schema(
            description = "req obj at the time of exit from parking"
    )
    //variables
    private String ticketId;
    private String slotId;

    //constructors
    public ExitRequest(String ticketId, String slotId) {
        this.ticketId = ticketId;
        this.slotId = slotId;

    }
    public ExitRequest() {
    }

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
}
