package dev.clara.toll_station.View;

import java.util.List;

public class TollStationView {
 public void displayReport(String name, String city, List<String> vehicles, int totalCollected) {
        System.out.println("Toll Station: " + name + " - " + city);
        System.out.println("Vehicles Processed:");
        for (String vehicleInfo : vehicles) {
            System.out.println(vehicleInfo);
        }
        System.out.println("Total Collected: $" + totalCollected);
    }
}
