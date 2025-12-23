package controller;

import data_transfer_object.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import service.ParkingService;

@Service
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
    public String exit(@RequestBody ExitRequest exitRequest) {
        return parkingService.exit(exitRequest);
    }
}

