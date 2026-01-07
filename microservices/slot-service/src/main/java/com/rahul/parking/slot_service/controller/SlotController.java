package com.rahul.parking.slot_service.controller;

import com.rahul.parking.slot_service.data_transfer_object.Slot;
import com.rahul.parking.slot_service.data_transfer_object.Vehicle;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rahul.parking.slot_service.service.SlotService;

@RestController
@RequestMapping("/slot")
@Tag(name="Slot Service" , description = "Slot related API's")
public class SlotController {
    private final SlotService slotService;

    public SlotController(SlotService slotService) {
        this.slotService = slotService;
    }
   @Operation(
           summary = "perform slot allocation to the respective vehicle",
           description = "allocates new  slot allocation for the vehicle"
   )

    @PostMapping("/allocate")
    public Slot allocate(@RequestBody Vehicle  vehicle) {
        return slotService.allocateSlot(vehicle);
    }

    @Operation(
            summary = "perform slot allocation to the respective vehicle",
            description = "release the previous slot for the vehicle"
    )
    @PostMapping("/release")
    public String  release(@RequestBody Slot  slot) {
        return slotService.releaseSlot(slot);
    }
}
