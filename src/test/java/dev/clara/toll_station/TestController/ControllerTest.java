package dev.clara.toll_station.TestController;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.clara.toll_station.Controller.TollStationController;
import dev.clara.toll_station.Model.TollStation;
import dev.clara.toll_station.Model.Vehicle;
import dev.clara.toll_station.View.TollStationView;

public class ControllerTest {
 private TollStation tollStationMock;
    private TollStationView viewMock;
    private TollStationController controller;

    @BeforeEach
    void setUp() {
        tollStationMock = mock(TollStation.class);
        viewMock = mock(TollStationView.class);

        controller = new TollStationController(tollStationMock, viewMock);
    }

    @Test
    void testProcessVehicle() {
        Vehicle vehicleMock = mock(Vehicle.class);

        controller.processVehicle(vehicleMock);

        verify(tollStationMock, times(1)).processVehicle(vehicleMock);
    }

    @Test
    void testGenerateReport() {
        when(tollStationMock.getName()).thenReturn("Main Toll");
        when(tollStationMock.getCity()).thenReturn("Springfield");
        when(tollStationMock.getVehicles()).thenReturn(Arrays.asList(
            "License Plate: ABC123, Toll: $5",
            "License Plate: XYZ789, Toll: $10"
        ));
        when(tollStationMock.getTotalCollected()).thenReturn(15);

        controller.generateReport();

        verify(viewMock, times(1)).displayReport(
            "Main Toll",
            "Springfield",
            Arrays.asList(
                "License Plate: ABC123, Toll: $5",
                "License Plate: XYZ789, Toll: $10"
            ),
            15
        );
    }
}
