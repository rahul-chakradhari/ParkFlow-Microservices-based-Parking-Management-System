package com.rahul.parking.slot_service.data_transfer_object;

import com.rahul.parking.slot_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;

public class Vehicle {

    @Schema(
            description = "vehicle obj for slot service"
    )
    //variables
    private String id;
    private String vehicleNumber;
    private VehicleType vehicleType;

    //getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

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
    public Vehicle(String id, String vehicleNumber, VehicleType vehicleType) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public Vehicle() {
    }
}
