package com.rahul.parking.parking_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;

public class PaymentResponse {
    @Schema(
            description = "payment obj at the time of exit from  parking"
    )
    //variables
    private String id;
    private String ticketId;
    private Double amount;
    private boolean paymentStatus;
    private String message;

    //getters and setters
    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    //constructors
    public PaymentResponse(Double amount, String id, Boolean paymentStatus, String ticketId, String message) {
        this.amount = amount;
        this.id = id;
        this.paymentStatus = paymentStatus;
        this.ticketId = ticketId;
        this.message = message;
    }

    public PaymentResponse() {
    }
}
