package com.rahul.parking.user_service.data_transfer_object;

public class ParkingResponse {
    //variables
    private boolean isParking;
    private String ticketId,slotId;
    private String message;

    //getters and setters
    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public Boolean getIsParking(){
        return isParking;
    }
    public void setIsParking(Boolean parking){
        isParking=parking;
    }
    public String getTicketId(){
        return ticketId;
    }
    public void setTicketId(String ticketId){
        this.ticketId=ticketId;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    //constructors
    public ParkingResponse(Boolean isParking, String ticketId, String slotId,String message) {
        this.isParking = isParking;
        this.ticketId = ticketId;
        this.slotId = slotId;
        this.message = message;
    }

    public ParkingResponse() {
    }
}
