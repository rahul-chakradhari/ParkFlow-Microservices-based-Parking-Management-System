package com.rahul.parking.pricing_service.data_transfer_object;

import com.rahul.parking.pricing_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PricingRequest {
    @Schema(
            description = "pricing req obj calculation based on vehicleType and hours parked by the vehicle"
    )

    private VehicleType vehicleType;
    private int hours;
    private String ticketId;


}
