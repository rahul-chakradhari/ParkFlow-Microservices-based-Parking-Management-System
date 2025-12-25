package data_transfer_object;

public class ExitRequest {
    //variables
    private String ticketId;

    //constructors
    public ExitRequest() {
    }

    public ExitRequest(String ticketId) {
        this.ticketId = ticketId;
    }

    //getters and setters
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
}
