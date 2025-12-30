package com.rahul.parking.slot_service.controller;

import com.rahul.parking.slot_service.data_transfer_object.Slot;
import com.rahul.parking.slot_service.data_transfer_object.Vehicle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rahul.parking.slot_service.service.SlotService;

@RestController
@RequestMapping("/slot")
public class SlotController {
    private final SlotService slotService;

    public SlotController(SlotService slotService) {
        this.slotService = slotService;
    }
    @PostMapping("/allocate")
    public Slot allocate(@RequestBody Vehicle  vehicle) {
        return slotService.allocateSlot(vehicle);
    }

    @PostMapping("/release")
    public String  release(@RequestBody Slot  slot) {
        return slotService.releaseSlot(slot);
    }
}
