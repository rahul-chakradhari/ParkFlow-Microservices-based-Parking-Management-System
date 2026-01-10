package com.rahul.parking.user_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntryResponse {

    @Schema(
            description = "response obj returned after user entry"
    )
    //variables
    private String ticketId;
    private String slotId;
    private String message;
    private boolean isParking;



}