package com.rahul.parking.parking_service.controller;

import com.rahul.parking.parking_service.data_transfer_object.EntryRequest;
import com.rahul.parking.parking_service.data_transfer_object.ExitRequest;
import com.rahul.parking.parking_service.data_transfer_object.TicketResponse;
import org.springframework.web.bind.annotation.*;
import com.rahul.parking.parking_service.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @PostMapping("/entry")
    public TicketResponse entry(@RequestBody EntryRequest entryRequest) {
        return parkingService.entry(entryRequest);
    }

    @PostMapping("/exit")
    public TicketResponse exit(@RequestBody ExitRequest exitRequest) {
        return parkingService.exit(exitRequest);
    }
}

