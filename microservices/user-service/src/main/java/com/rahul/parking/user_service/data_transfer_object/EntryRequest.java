package com.rahul.parking.user_service.data_transfer_object;

import com.rahul.parking.user_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntryRequest{

    @Schema(
            description = "request obj used at the time of user entry"
    )
    //variables
    private String ticketId;
    private String slotId;
    private String vehicleNumber;
    private VehicleType vehicleType;


}

