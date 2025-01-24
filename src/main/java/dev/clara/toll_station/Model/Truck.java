package dev.clara.toll_station.Model;

public class Truck extends Vehicle {
    private int axles;

    public Truck(String licensePlate, int axles) {
        super(licensePlate);
        this.axles = axles;
    }

    @Override
    public int getToll() {
        return 50 * axles;
    }
}
