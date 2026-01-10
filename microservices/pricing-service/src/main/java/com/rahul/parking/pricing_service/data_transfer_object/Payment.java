package com.rahul.parking.pricing_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    @Schema(
            description = "Payment obj created during pricing service"
    )
    //variables
    private String id;
    private String ticketId;
    private Double amount;
    private Boolean paymentStatus;


}
