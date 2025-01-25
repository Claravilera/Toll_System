package dev.clara.toll_station.TestModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.clara.toll_station.Model.Car;

public class CarTest {
@Test
    void testCarConstructor() {
        Car car = new Car("XYZ123");

        assertEquals("XYZ123", car.getLicensePlate());
    }

    @Test
    void testGetToll() {
        Car car = new Car("ABC456");

        assertEquals(100, car.getToll());
    }
}
