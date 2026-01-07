package com.rahul.parking.user_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;

public class ExitRequest {

    @Schema(
            description = "exit request obj at the time of user exit"
    )
    //variables
    private String ticketId;
    private String slotId;

    //getters and setters
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public String getSlotId() {
        return slotId;
    }
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    //constructors
    public ExitRequest() {
    }

    public ExitRequest(String ticketId, String slotId) {
        this.ticketId = ticketId;
        this.slotId = slotId;
    }
}
