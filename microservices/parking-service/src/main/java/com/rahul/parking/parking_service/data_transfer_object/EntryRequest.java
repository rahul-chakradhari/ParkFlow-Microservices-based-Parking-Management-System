package com.rahul.parking.parking_service.data_transfer_object;

import com.rahul.parking.parking_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;

public class EntryRequest {
    @Schema(
            description = "req obj at the time of entry for parking"
    )
    //variables
    private String vehicleNumber;
    private VehicleType vehicleType;

    // getters & setters
    public String getvehicleNumber() {
        return vehicleNumber;
    }

    public void setvehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    // constructors
    public EntryRequest() {
    }

    public EntryRequest(String vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
}
