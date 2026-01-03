package com.rahul.parking.parking_service.data_transfer_object;

public class SlotResponse {
    //variables
    private boolean occupied;
    private String id;
    private String message;

    //getters and setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Boolean getOccupied() {
        return occupied;
    }
    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    //constructors
    public SlotResponse() {
    }

    public SlotResponse(Boolean occupied, String id, String message) {
        this.occupied = occupied;
        this.id = id;
        this.message = message;
    }
}
