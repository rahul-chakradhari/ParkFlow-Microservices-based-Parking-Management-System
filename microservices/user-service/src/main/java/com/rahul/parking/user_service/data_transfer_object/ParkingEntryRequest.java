package com.rahul.parking.user_service.data_transfer_object;

import com.rahul.parking.user_service.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ParkingEntryRequest {

    //variables
    private String ticketId;
    private String slotId;
    private VehicleType vehicleType;

}
