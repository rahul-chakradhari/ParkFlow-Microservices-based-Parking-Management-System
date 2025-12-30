package com.rahul.parking.user_service.data_transfer_object;

public class TicketResponse {
    //variables
    private String ticketId;
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

    //constructors
    public TicketResponse() {
    }

    public TicketResponse(String message, String ticketId) {
        this.message = message;
        this.ticketId = ticketId;
    }

}
