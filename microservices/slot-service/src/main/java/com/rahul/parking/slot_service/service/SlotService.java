package com.rahul.parking.slot_service.service;

import com.rahul.parking.slot_service.data_transfer_object.Slot;
import com.rahul.parking.slot_service.data_transfer_object.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class SlotService {

    // allocate slot
    public Slot allocateSlot(Vehicle vehicle) {
        if (vehicle == null) return null;

        Slot slot = new Slot();
        slot.setId("SLOT ID : " + System.currentTimeMillis());
        slot.setVehicleType(vehicle.getVehicleType());
        slot.setFloorNumber("1st floor");
        slot.setOccupied(true);

        return slot;
    }

    // release slot
    public String releaseSlot(Slot slot) {
        if (slot == null || slot.getId() == null) {
            return "Invalid slot details";
        }
        slot.setOccupied(false);
        return "Slot had been released for Slot Number: " + slot.getId() +"| Hours parked: "+slot.getHours() ;
    }


}
