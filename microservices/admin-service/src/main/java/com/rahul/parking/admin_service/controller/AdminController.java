package com.rahul.parking.admin_service.controller;

import com.rahul.parking.admin_service.data_transfer_object.AdminRequest;
import com.rahul.parking.admin_service.data_transfer_object.AdminResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.expression.*;
import org.springframework.web.bind.annotation.*;
import com.rahul.parking.admin_service.service.AdminService;

@RestController
@RequestMapping("/admin")
@Tag(name="Admin Service",description = "Admin related API")

public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @Operation(
            summary = "perform admin action",
            description = "Handles admin related operations"
    )
    @PostMapping("/action")
    public AdminResponse handleAdminAction(@RequestBody AdminRequest request) {
        return adminService.processAdminRequest(request);
    }
}

