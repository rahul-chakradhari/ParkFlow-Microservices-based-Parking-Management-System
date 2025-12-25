package data_transfer_object;

public class ParkingResponse {
    //variables
    private Boolean isParking;
    private String ticketId,slotId;


    //constructors
    public ParkingResponse(Boolean isParking, String ticketId, String slotId) {
        this.isParking = isParking;
        this.ticketId = ticketId;
        this.slotId = slotId;
    }

    public ParkingResponse() {
    }

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
}
