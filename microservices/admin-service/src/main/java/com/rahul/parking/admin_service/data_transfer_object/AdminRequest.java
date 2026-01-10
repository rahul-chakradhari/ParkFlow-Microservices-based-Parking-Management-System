
package com.rahul.parking.admin_service.data_transfer_object;


import com.rahul.parking.admin_service.enums.AdminActionType;
import com.rahul.parking.admin_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminRequest {
    @Schema(
            description = "Request object used for performing admin actions"
    )
    //variables
    private AdminActionType adminActionType;
    private String ticketId;
    private Integer amount;
    private String description;

    //special entry variables
    private String vehicleNumber;
    private VehicleType vehicleType;

    //constructors
    public AdminRequest(AdminActionType adminActionType, Integer amount, String description, String ticketId, String vehicleNumber, VehicleType vehicleType) {
        this.adminActionType = adminActionType;
        this.amount = amount;
        this.description = description;
        this.ticketId = ticketId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
}




