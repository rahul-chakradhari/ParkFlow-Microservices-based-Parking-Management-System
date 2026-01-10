package com.rahul.parking.parking_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SlotResponse {

    @Schema(
            description = "slot obj at the time of entry & exit response from parking"
    )
    //variables
    private boolean occupied;
    private String id;
    private String message;


}
