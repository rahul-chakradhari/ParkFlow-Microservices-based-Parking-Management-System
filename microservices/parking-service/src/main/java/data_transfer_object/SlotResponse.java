package data_transfer_object;

public class SlotResponse {
    //variables
    private Boolean occupied;
    private String slotId;
    private Boolean availableSlotType;

    //constructors
    public SlotResponse() {
    }

    public SlotResponse(Boolean occupied, String slotId,Boolean availableSlotType) {
        this.occupied = occupied;
        this.slotId = slotId;
        this.availableSlotType = availableSlotType;
    }


    //getters and setters
    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Boolean getAvailableSlotType() {
        return availableSlotType;
    }

    public void setAvailableSlotType(Boolean availableSlotType) {
        this.availableSlotType = availableSlotType;
    }
}
