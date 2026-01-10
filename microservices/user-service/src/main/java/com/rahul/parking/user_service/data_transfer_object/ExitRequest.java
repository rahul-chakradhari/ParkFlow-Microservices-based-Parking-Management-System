package com.rahul.parking.user_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExitRequest {

    @Schema(
            description = "exit request obj at the time of user exit"
    )
    //variables
    private String ticketId;
    private String slotId;


}
