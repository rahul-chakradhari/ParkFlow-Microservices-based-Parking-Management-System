package data_transfer_object_layer.exit;

public class ExitRequest {
    //variable
    private String ticketId;
    private Boolean paymentDone;

    //getters and setters
    public String getTicketId() {
        return ticketId;
    }

    public Boolean getPaymentDone() {
        return paymentDone;
    }

    public void setPaymentDone(Boolean paymentDone) {
        this.paymentDone = paymentDone;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }



}
