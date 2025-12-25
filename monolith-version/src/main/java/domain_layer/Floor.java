package domain_layer;

import jakarta.persistence.Entity;

@Entity
public class Floor {
    //variables
    private String id;
    private String floorNumber;
    private Integer slotsRemaining;
    private Integer slotsBooked;

    //getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }
    public Integer getSlotsRemaining() {
        return slotsRemaining;
    }
    public void setSlotsRemaining(Integer slotsRemaining) {
        this.slotsRemaining = slotsRemaining;
    }
    public Integer getSlotsBooked() {
        return slotsBooked;
    }
    public void setSlotsBooked(Integer slotsBooked) {
        this.slotsBooked = slotsBooked;
    }

    //constructors
    public Floor() {
        super();
    }
    public Floor(String id, String floorNumber, Integer slotsRemaining, Integer slotsBooked) {
        super();
        this.id = id;
        this.floorNumber = floorNumber;
        this.slotsRemaining = slotsRemaining;
        this.slotsBooked = slotsBooked;
    }
}
