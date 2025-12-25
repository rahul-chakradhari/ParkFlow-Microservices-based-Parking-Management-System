package data_transfer_object;
import enums.VehicleType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


@Entity
public class Slot {
    //variables
    private String id;
    private Boolean occupied ;
    private String floorNumber;
    private String slotType;
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    //getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean getOccupied() {
        return occupied;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    public String getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }
    public String getSlotType() {
        return slotType;
    }
    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    //constructors
    public Slot() {
        super();
    }
    public Slot(String id, Boolean occupied, String floorNumber, String slotType) {
        super();
        this.id = id;
        this.occupied = occupied;
        this.floorNumber = floorNumber;
        this.slotType = slotType;
    }
}
