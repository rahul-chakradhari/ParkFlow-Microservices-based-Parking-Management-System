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
