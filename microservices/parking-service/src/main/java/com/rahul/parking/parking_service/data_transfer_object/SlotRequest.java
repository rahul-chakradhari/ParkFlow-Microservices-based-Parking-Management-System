package com.rahul.parking.parking_service.data_transfer_object;

import com.rahul.parking.parking_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;

public class SlotRequest {
    @Schema(
            description = "slot obj at the time of entry & exit request for parking"
    )
    //variables
    private String vehicleNumber;
    private VehicleType vehicleType;

    //getters and setters
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

    //constructors
    public SlotRequest(String vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public SlotRequest() {
    }
}

