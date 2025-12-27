
package data_transfer_object;


import enums.AdminActionType;

public class AdminRequest {
    //variables
    private AdminActionType adminActionType;
    private String ticketId;
    private String description;
    private Integer amount;

    //getters and setters
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



}




