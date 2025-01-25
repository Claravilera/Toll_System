package dev.clara.toll_station.Model;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
 private String name;
    private String city;
    private int totalCollected;
    private List<String> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.vehicles = new ArrayList<>();
    }

    public void processVehicle(Vehicle vehicle) {
        int toll = vehicle.getToll();
        totalCollected += toll;
        vehicles.add("License Plate: " + vehicle.getLicensePlate() + ", Toll: $" + toll);
    }

    public void generateReport() {
        System.out.println("Toll Station: " + name + " - " + city);
        System.out.println("Vehicles Processed:");
        for (String vehicleInfo : vehicles) {
            System.out.println(vehicleInfo);
        }
        System.out.println("Total Collected: $" + totalCollected);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public int getTotalCollected() {
        return totalCollected;
    }
    
}
