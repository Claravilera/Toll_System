package dev.clara.toll_station.TestModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.clara.toll_station.Model.Truck;

public class TruckTest {
 @Test
    void testTruckConstructor() {
        Truck truck = new Truck("TRUCK123", 3);

        assertEquals("TRUCK123", truck.getLicensePlate());

        assertEquals(150, truck.getToll()); // 50 * 3 = 150
    }

    @Test
    void testGetTollWithOneAxle() {
        Truck truck = new Truck("ONEAXLE", 1);

        assertEquals(50, truck.getToll()); // 50 * 1 = 50
    }

    @Test
    void testGetTollWithMultipleAxles() {
        Truck truck = new Truck("FIVEAXLES", 5);

        assertEquals(250, truck.getToll()); // 50 * 5 = 250
    }
}
