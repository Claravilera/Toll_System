package dev.clara.toll_station.Model;

public class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public int getToll() {
        return 50;
    }
}
