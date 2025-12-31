
package com.rahul.parking.admin_service.service;
import com.rahul.parking.admin_service.data_transfer_object.AdminRequest;
import com.rahul.parking.admin_service.data_transfer_object.AdminResponse;


public class AdminService {

    public AdminResponse processAdminRequest(AdminRequest request)
    {
        AdminResponse response = new AdminResponse();
        //if invalid request or empty admin request
        if(request==null || request.getAdminActionType()==null){
            response.setSuccess(false);
            response.setMessage("Invalid admin request");
            return response;
        }

        //available options for admin control
        switch (request.getAdminActionType()) {
            case USER_QUERY:
                response.setSuccess(true);
                response.setResolved(true);
                response.setMessage("Query had been resolved ");
                break;
            case SPECIAL_ENTRY:
                response.setSuccess(true);
                response.setMessage("Special Entry is allowed for  vehicle "+request.getVehicleNumber()+"("+request.getVehicleType()+")");
                break;
            case TICKET_REGENERATE:
                response.setSuccess(true);
                //generating specific admin request reference
                String referenceId = "ADMIN-" + System.currentTimeMillis();
                response.setReferenceId(referenceId);
                response.setMessage("Ticket had been regenerated ");
                break;
            default:
                response.setSuccess(false);
                response.setMessage("Invalid admin request");
                return response;

        }

        response.setSuccess(true);
        return response;

    }
}

