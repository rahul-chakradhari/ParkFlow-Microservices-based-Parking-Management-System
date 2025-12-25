package com.rahul.parkinglot.parking_lot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to the Parking Lot!";
    }
}
