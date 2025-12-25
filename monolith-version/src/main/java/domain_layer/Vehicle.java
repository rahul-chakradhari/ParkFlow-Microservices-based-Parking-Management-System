package domain_layer;

import enums.VehicleType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Vehicle {
    //variables
    private String id;
    private String licenceNumber;
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    //getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getLicenceNumber() {
        return licenceNumber;
    }
    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    //constructors
    public Vehicle() {
        super();
    }


    public Vehicle(String id, String licenceNumber, VehicleType vehicleType) {
        super();
        this.id = id;
        this.licenceNumber = licenceNumber;
        this.vehicleType = vehicleType;    }

}
