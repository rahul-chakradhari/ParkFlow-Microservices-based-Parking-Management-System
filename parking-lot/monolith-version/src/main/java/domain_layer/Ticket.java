package domain_layer;

import jakarta.persistence.Entity;

@Entity
public class Ticket {
    //variables
    private String id;
    private String vehicleId;
    private String slotId;
    private String entryTime;
    private Boolean ticketStatus;

    //getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getSlotId() {
        return slotId;
    }
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }
    public String getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }
    public Boolean getTicketStatus() {
        return ticketStatus;
    }
    public void setTicketStatus(Boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    //constructors
    public Ticket() {
        super();
    }
    public Ticket(String id, String vehicleId, String slotId, String entryTime, Boolean ticketStatus) {
        super();
        this.id = id;
        this.vehicleId = vehicleId;
        this.slotId = slotId;
        this.entryTime = entryTime;
        this.ticketStatus = ticketStatus;
    }

}
