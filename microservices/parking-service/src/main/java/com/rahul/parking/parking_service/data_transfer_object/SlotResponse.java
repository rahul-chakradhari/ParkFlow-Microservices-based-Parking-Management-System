package com.rahul.parking.parking_service.data_transfer_object;

public class SlotResponse {
    //variables
    private boolean occupied;
    private String id;

    //constructors
    public SlotResponse() {
    }

    public SlotResponse(Boolean occupied, String id) {
        this.occupied = occupied;
        this.id = id;
    }


    //getters and setters
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

}
