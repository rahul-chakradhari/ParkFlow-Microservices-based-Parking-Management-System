package com.rahul.parking.parking_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExitRequest {

    @Schema(
            description = "req obj at the time of exit from parking"
    )
    //variables
    private String ticketId;
    private String slotId;



}
