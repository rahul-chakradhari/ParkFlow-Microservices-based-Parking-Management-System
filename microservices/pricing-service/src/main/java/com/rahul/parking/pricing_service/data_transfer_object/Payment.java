package com.rahul.parking.pricing_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;

public class Payment {
    @Schema(
            description = "Payment obj created during pricing service"
    )
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
    public Payment() {
        super();
    }
    public Payment(String id, String ticketId, Double amount, Boolean paymentStatus) {
        super();
        this.id = id;
        this.ticketId = ticketId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

}
