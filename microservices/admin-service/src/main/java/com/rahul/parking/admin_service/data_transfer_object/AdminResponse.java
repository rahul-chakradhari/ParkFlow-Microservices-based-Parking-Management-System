
package com.rahul.parking.admin_service.data_transfer_object;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminResponse {

    @Schema(
            description = "response returned after performing admin operations"
    )
    //variables
    private boolean success;
    private String message;
    private String referenceId;
    //user query variable
    private boolean resolved;



}
