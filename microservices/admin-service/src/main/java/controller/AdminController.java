<<<<<<< HEAD
package controller;

import data_transfer_object.*;
import org.springframework.web.bind.annotation.*;
import service.AdminService;

@RestController
public class AdminController {
    private final AdminService adminService =new  AdminService();

    public AdminResponse handleAdminAction(@RequestBody AdminRequest request) {
        return adminService.processAdminRequest(request);
    }
}
=======
package controller;

import data_transfer_object.*;
import org.springframework.web.bind.annotation.*;
import service.AdminService;

@RestController
public class AdminController {
    private final AdminService adminService =new  AdminService();

    public AdminResponse handleAdminAction(@RequestBody AdminRequest request) {
        return adminService.processAdminRequest(request);
    }
}
>>>>>>> 9780f22bce0d570e8526a7f6ef38dc2af128417f
