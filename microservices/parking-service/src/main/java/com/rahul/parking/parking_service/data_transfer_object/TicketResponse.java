package com.rahul.parking.parking_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketResponse {
    @Schema(
            description = "ticket response obj at the time of entry & exit at parking"
    )
    //variables
    private String ticketId;
    private String slotId;
    private boolean parking;
    private String message;

}
