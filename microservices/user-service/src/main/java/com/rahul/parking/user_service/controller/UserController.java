package com.rahul.parking.user_service.controller;

import com.rahul.parking.user_service.data_transfer_object.EntryRequest;
import com.rahul.parking.user_service.data_transfer_object.EntryResponse;
import com.rahul.parking.user_service.data_transfer_object.ExitRequest;
import com.rahul.parking.user_service.data_transfer_object.ParkingResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rahul.parking.user_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/entry")
    public EntryResponse processEntry(@RequestBody EntryRequest entryRequest){
        return userService.processEntry(entryRequest);
    }
    @PostMapping("/exit")
    public ParkingResponse processExit(@RequestBody ExitRequest exitRequest){
        return userService.processExit(exitRequest);
    }
}
