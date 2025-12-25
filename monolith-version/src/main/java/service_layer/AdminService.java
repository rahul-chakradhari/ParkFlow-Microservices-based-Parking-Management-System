<<<<<<< HEAD
package service_layer;

import data_transfer_object_layer.admin.*;

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
        //generating specific admin request reference
        String referenceId = "ADMIN-" + System.currentTimeMillis();

        //available options for admin control
        switch (request.getAdminActionType()) {
            case USER_QUERY:
                response.setMessage("Query had been resolved ");
                break;
            case UPDATE_VEHICLE_NEW_PRICE:
                response.setMessage("Vehicle New Price has been updated ");
                break;
            case EXTRA_FINE:
                response.setMessage("Extra Fine has been updated ");
                break;
            case SPECIAL_ENTRY:
                response.setMessage("Special Entry is allowed for this vehicle ");
                break;
            case TICKET_REGENERATE:
                response.setMessage("Ticket had been regenerated for Reference Id: " + referenceId);
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
=======
package service_layer;

import data_transfer_object_layer.admin.*;

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
        //generating specific admin request reference
        String referenceId = "ADMIN-" + System.currentTimeMillis();

        //available options for admin control
        switch (request.getAdminActionType()) {
            case USER_QUERY:
                response.setMessage("Query had been resolved ");
                break;
            case UPDATE_VEHICLE_NEW_PRICE:
                response.setMessage("Vehicle New Price has been updated ");
                break;
            case EXTRA_FINE:
                response.setMessage("Extra Fine has been updated ");
                break;
            case SPECIAL_ENTRY:
                response.setMessage("Special Entry is allowed for this vehicle ");
                break;
            case TICKET_REGENERATE:
                response.setMessage("Ticket had been regenerated for Reference Id: " + referenceId);
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
>>>>>>> 9780f22bce0d570e8526a7f6ef38dc2af128417f
