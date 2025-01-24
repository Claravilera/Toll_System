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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public String getCity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCity'");
    }

    public List<String> getVehicles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVehicles'");
    }

    public int getTotalCollected() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTotalCollected'");
    }
}
