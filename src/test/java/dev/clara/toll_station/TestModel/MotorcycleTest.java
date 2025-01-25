package dev.clara.toll_station.TestModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.clara.toll_station.Model.Motorcycle;

public class MotorcycleTest {
  @Test
    void testMotorcycleConstructor() {
        Motorcycle motorcycle = new Motorcycle("MOTO123");

        assertEquals("MOTO123", motorcycle.getLicensePlate());
    }

    @Test
    void testGetToll() {
        Motorcycle motorcycle = new Motorcycle("BIKE456");

        assertEquals(50, motorcycle.getToll());
    }
}
