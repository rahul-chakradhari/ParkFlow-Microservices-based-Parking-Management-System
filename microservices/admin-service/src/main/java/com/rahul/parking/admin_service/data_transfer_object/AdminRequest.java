
package com.rahul.parking.admin_service.data_transfer_object;


import com.rahul.parking.admin_service.enums.AdminActionType;
import com.rahul.parking.admin_service.enums.VehicleType;
import io.swagger.v3.oas.annotations.media.Schema;

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

    //getters and setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public AdminActionType getAdminActionType() {
        return adminActionType;
    }

    public void setAdminActionType(AdminActionType adminActionType) {
        this.adminActionType = adminActionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    //constructors
    public AdminRequest(AdminActionType adminActionType, Integer amount, String description, String ticketId, String vehicleNumber, VehicleType vehicleType) {
        this.adminActionType = adminActionType;
        this.amount = amount;
        this.description = description;
        this.ticketId = ticketId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
    public AdminRequest() {
    }
}




