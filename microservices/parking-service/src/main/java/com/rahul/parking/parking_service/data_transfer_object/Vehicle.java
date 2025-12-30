package com.rahul.parking.parking_service.data_transfer_object;


import com.rahul.parking.parking_service.enums.VehicleType;

public class Vehicle {

    //variables
    private String vehicleNumber;
    private VehicleType vehicleType;

    //getters and setters


    public String getvehicleNumber(String s) {
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
    public Vehicle(String vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public Vehicle() {
    }
}

