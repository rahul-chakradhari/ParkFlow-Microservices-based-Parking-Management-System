package data_transfer_object;

public class EntryResponse {
    //variables
    private String ticketId;
    private String slotId;
    private String message;

    //constructors
    public EntryResponse() {
    }

    public EntryResponse(String message, String slotId, String ticketId) {
        this.message = message;
        this.slotId = slotId;
        this.ticketId = ticketId;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}