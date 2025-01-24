package dev.clara.toll_station.Controller;

import dev.clara.toll_station.Model.TollStation;
import dev.clara.toll_station.Model.Vehicle;
import dev.clara.toll_station.View.TollStationView;

public class TollStationController {
    private TollStation tollStation;
    private TollStationView view;

    public TollStationController(TollStation tollStation, TollStationView view) {
        this.tollStation = tollStation;
        this.view = view;
    }

    public void processVehicle(Vehicle vehicle) {
        tollStation.processVehicle(vehicle);
    }

    public void generateReport() {
        view.displayReport(
            tollStation.getName(),
            tollStation.getCity(),
            tollStation.getVehicles(),
            tollStation.getTotalCollected()
        );
    }
}