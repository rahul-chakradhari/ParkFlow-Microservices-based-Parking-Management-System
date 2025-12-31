package com.rahul.parking.admin_service.controller;

import com.rahul.parking.admin_service.data_transfer_object.AdminRequest;
import com.rahul.parking.admin_service.data_transfer_object.AdminResponse;
import org.springframework.web.bind.annotation.*;
import com.rahul.parking.admin_service.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService =new  AdminService();

    @PostMapping("/action")
    public AdminResponse handleAdminAction(@RequestBody AdminRequest request) {
        return adminService.processAdminRequest(request);
    }
}

