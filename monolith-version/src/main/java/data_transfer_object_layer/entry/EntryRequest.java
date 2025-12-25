package data_transfer_object_layer.entry;

import domain_layer.Vehicle;


public class EntryRequest{
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
