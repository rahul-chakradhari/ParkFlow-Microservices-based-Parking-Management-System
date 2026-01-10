package com.rahul.parking.parking_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentResponse {
    @Schema(
            description = "payment obj at the time of exit from  parking"
    )
    //variables
    private String id;
    private String ticketId;
    private Double amount;
    private boolean paymentStatus;
    private String message;


}
