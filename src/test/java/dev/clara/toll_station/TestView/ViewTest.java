package dev.clara.toll_station.TestView;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.clara.toll_station.View.TollStationView;

public class ViewTest {
private TollStationView tollStationView;

    @BeforeEach
    void setUp() {
        tollStationView = new TollStationView();
    }

    @Test
    void testDisplayReport() {
        String name = "Main Toll";
        String city = "Springfield";
        List<String> vehicles = Arrays.asList(
            "License Plate: ABC123, Toll: $5",
            "License Plate: XYZ789, Toll: $10"
        );
        int totalCollected = 15;

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        tollStationView.displayReport(name, city, vehicles, totalCollected);

        String expectedOutput = """
            Toll Station: Main Toll - Springfield
            Vehicles Processed:
            License Plate: ABC123, Toll: $5
            License Plate: XYZ789, Toll: $10
            Total Collected: $15
            """;

        assertEquals(expectedOutput.strip(), outContent.toString().strip());

        System.setOut(System.out);
    }
}
