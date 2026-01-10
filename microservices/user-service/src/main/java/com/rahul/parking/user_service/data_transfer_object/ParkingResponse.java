package com.rahul.parking.user_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ParkingResponse {

    @Schema(
            description = "Checking the current parking response of the vehicle"
    )
    //variables
    private boolean isParking;
    private String ticketId,slotId;
    private String message;


}
