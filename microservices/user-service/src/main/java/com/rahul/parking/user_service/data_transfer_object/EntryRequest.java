package com.rahul.parking.user_service.data_transfer_object;

import com.rahul.parking.user_service.enums.VehicleType;

public class EntryRequest{
    //variables
    private String ticketId;
    private String slotId;
    private String vehicleNumber;
    private VehicleType vehicleType;

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

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    //constructors
    public EntryRequest() {
    }

    public EntryRequest(String ticketId,String slotId,String vehicleNumber, VehicleType vehicleType) {
        this.ticketId = ticketId;
        this.slotId = slotId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
}

