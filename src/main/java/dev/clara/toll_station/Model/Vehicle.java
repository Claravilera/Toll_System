package dev.clara.toll_station.Model;

public class Vehicle {
    private String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getToll() {
        return 0;
    }
}

