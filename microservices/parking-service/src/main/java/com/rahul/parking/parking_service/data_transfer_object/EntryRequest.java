package com.rahul.parking.parking_service.data_transfer_object;

import com.rahul.parking.parking_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntryRequest {
    @Schema(
            description = "req obj at the time of entry for parking"
    )
    //variables
    private String vehicleNumber;
    private VehicleType vehicleType;


}
