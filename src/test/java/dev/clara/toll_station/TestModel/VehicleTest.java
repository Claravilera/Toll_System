package dev.clara.toll_station.TestModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.clara.toll_station.Model.Vehicle;

public class VehicleTest {
 @Test
    void testVehicleConstructorAndGetLicensePlate() {
        Vehicle vehicle = new Vehicle("ABC123");

        assertEquals("ABC123", vehicle.getLicensePlate());
    }

    @Test
    void testGetToll() {
        Vehicle vehicle = new Vehicle("XYZ987");

        assertEquals(0, vehicle.getToll());
    }
}
