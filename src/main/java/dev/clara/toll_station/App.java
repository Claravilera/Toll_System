package dev.clara.toll_station;

import dev.clara.toll_station.Model.TollStation;
import dev.clara.toll_station.View.TollStationView;
import dev.clara.toll_station.Controller.TollStationController;
import dev.clara.toll_station.Model.Car;
import dev.clara.toll_station.Model.Motorcycle;
import dev.clara.toll_station.Model.Truck;


public class App {
    public static void main(String[] args) {
        TollStation tollStation = new TollStation("Main Toll", "New York");
        TollStationView view = new TollStationView();
        TollStationController controller = new TollStationController(tollStation, view);

        controller.processVehicle(new Car("ABC123"));
        controller.processVehicle(new Motorcycle("XYZ789"));
        controller.processVehicle(new Truck("LMN456", 4));

        controller.generateReport();
    }
}