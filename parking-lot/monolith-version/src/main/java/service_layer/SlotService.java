package service_layer;

import domain_layer.*;

public class SlotService {

    //allocate slot
    public Slot allocateSlot(Vehicle vehicle){
        if(vehicle==null) return null;
        Slot slot = new Slot();
        slot.setId("SLOT"+System.currentTimeMillis());
        slot.setVehicleType(vehicle.getVehicleType());
        slot.setFloorNumber("1st floor");
        slot.setOccupied(true);
        return slot;
    }

    //release slot
    public Boolean releaseSlot(Slot slot){
        if(slot==null) return false;
        slot.setOccupied(false);
        return true;
    }
}
