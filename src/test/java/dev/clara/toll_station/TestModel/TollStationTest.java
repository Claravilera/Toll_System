package dev.clara.toll_station.TestModel;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.clara.toll_station.Model.TollStation;
import dev.clara.toll_station.Model.Vehicle;

class TollStationTest {

    private TollStation tollStation;
    private Vehicle car1;
    private Vehicle car2;

    @BeforeEach
    void setUp() {
        tollStation = new TollStation("Main Toll", "Springfield");
        car1 = new Vehicle("ABC123") {
            @Override
            public int getToll() {
                return 5;
            }
        };
        car2 = new Vehicle("XYZ789") {
            @Override
            public int getToll() {
                return 10;
            }
        };
    }

    @Test
    void testProcessVehicle() {
        tollStation.processVehicle(car1);
        tollStation.processVehicle(car2);

        List<String> vehicles = tollStation.getVehicles();
        assertEquals(2, vehicles.size());
        assertEquals("License Plate: ABC123, Toll: $5", vehicles.get(0));
        assertEquals("License Plate: XYZ789, Toll: $10", vehicles.get(1));
    }

    @Test
    void testTotalCollected() {
        tollStation.processVehicle(car1);
        tollStation.processVehicle(car2);

        assertEquals(15, tollStation.getTotalCollected());
    }

    @Test
    void testGetNameAndCity() {
        assertEquals("Main Toll", tollStation.getName());
        assertEquals("Springfield", tollStation.getCity());
    }

    @Test
    void testGenerateReport() {
        tollStation.processVehicle(car1);
        tollStation.processVehicle(car2);

        tollStation.generateReport();
    }
}