package dev.clara.toll_station.Model;

public class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public int getToll() {
        return 100;
    }
}