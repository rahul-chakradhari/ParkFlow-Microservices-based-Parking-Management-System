package com.rahul.parking.user_service.controller;

import com.rahul.parking.user_service.data_transfer_object.EntryRequest;
import com.rahul.parking.user_service.data_transfer_object.EntryResponse;
import com.rahul.parking.user_service.data_transfer_object.ExitRequest;
import com.rahul.parking.user_service.data_transfer_object.ParkingResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rahul.parking.user_service.service.UserService;

@RestController
@RequestMapping("/user")
@Tag(name="User Service" ,description = "User related API's")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(
            summary = "perform user entry ",
            description = "handles user entry request & response"
    )
    @PostMapping("/entry")
    public EntryResponse processEntry(@RequestBody EntryRequest entryRequest){
        return userService.processEntry(entryRequest);
    }

    @Operation(
            summary = "perform user exit",
            description = "handles user exit request & response"
    )
    @PostMapping("/exit")
    public ParkingResponse processExit(@RequestBody ExitRequest exitRequest){
        return userService.processExit(exitRequest);
    }
}
