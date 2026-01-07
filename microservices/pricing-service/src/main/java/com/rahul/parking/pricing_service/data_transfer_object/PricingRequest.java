package com.rahul.parking.pricing_service.data_transfer_object;

import com.rahul.parking.pricing_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;

public class PricingRequest {
    @Schema(
            description = "pricing req obj calculation based on vehicleType and hours parked by the vehicle"
    )

    private VehicleType vehicleType;
    private int hours;
    private String ticketId;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public PricingRequest() {
    }
}
