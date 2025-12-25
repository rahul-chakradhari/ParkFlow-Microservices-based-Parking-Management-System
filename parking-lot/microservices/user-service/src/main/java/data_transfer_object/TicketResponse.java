package data_transfer_object;

public class TicketResponse {
    private String ticketId;
    private String message;

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
}
