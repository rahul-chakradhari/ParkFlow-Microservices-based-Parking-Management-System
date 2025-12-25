package controller;

import data_transfer_object.Slot;
import data_transfer_object.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.SlotService;

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
    public Boolean release(@RequestBody Slot  slot) {
        return slotService.releaseSlot(slot);
    }
}
