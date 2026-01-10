package com.rahul.parking.slot_service.data_transfer_object;

import com.rahul.parking.slot_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;

public class Slot {

    @Schema(
            description = "slot obj for slot service"
    )
    //variables
    private String id;
    private VehicleType vehicleType;
    private String floorNumber;
    private boolean occupied;
    private int hours;

    //getters and setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    //constructors
    public Slot(String floorNumber, String id, boolean occupied, VehicleType vehicleType, int hours) {
        this.floorNumber = floorNumber;
        this.hours = hours;
        this.id = id;
        this.occupied = occupied;
        this.vehicleType = vehicleType;
    }

    public Slot() {
    }
}