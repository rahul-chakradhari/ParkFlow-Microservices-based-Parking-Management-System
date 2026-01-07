package com.rahul.parking.parking_service.controller;

import com.rahul.parking.parking_service.data_transfer_object.EntryRequest;
import com.rahul.parking.parking_service.data_transfer_object.ExitRequest;
import com.rahul.parking.parking_service.data_transfer_object.TicketResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import com.rahul.parking.parking_service.service.ParkingService;

@RestController
@RequestMapping("/parking")
@Tag(name="Parking Service" , description = "Parking related API's")
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @Operation(
            summary = "perform parking entry",
            description = "handles parking entry request & response "
    )
    @PostMapping("/entry")
    public TicketResponse entry(@RequestBody EntryRequest entryRequest) {
        return parkingService.entry(entryRequest);
    }

    @Operation(
            summary = "perform parking exit",
            description = "handles parking exit request & response"
    )
    @PostMapping("/exit")
    public TicketResponse exit(@RequestBody ExitRequest exitRequest) {
        return parkingService.exit(exitRequest);
    }
}

