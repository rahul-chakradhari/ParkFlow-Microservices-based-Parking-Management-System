package com.rahul.parking.parking_service.data_transfer_object;

public class PaymentResponse {

    //variables
    private String id;
    private String ticketId;
    private Double amount;
    private Boolean paymentStatus;

    //getters and setters
    public String getId() {
        return id;
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

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    //constructors
    public PaymentResponse(Double amount, String id, Boolean paymentStatus, String ticketId) {
        this.amount = amount;
        this.id = id;
        this.paymentStatus = paymentStatus;
        this.ticketId = ticketId;
    }

    public PaymentResponse() {
    }
}
