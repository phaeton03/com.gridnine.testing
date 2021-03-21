package com.gridnine.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FilterFlightTests {
    private List<Flight> flightList = FlightBuilder.createFlights();
    @DisplayName("is one flight arriving before departure?")
    @Test
    void filterArrivingBeforeDeparture() {
        assertNotNull(flightList);
        assertEquals(1,
                FilterFlight.filter
                        (new FilterFlightArrivalBeforeDeparture(),flightList).size());
    }
    @DisplayName("Is one flight arriving before now ?")
    @Test
    void filterArrivingBeforeNow() {
        assertNotNull(flightList);
        assertEquals(1,
                FilterFlight.filter
                        (new FilterFlightBeforeNow(),flightList).size());

    }
    @DisplayName("Do two flights have ground time more than two hours?")
    @Test
    void filterArrivingGroundTimeMoreTwo() {
        assertNotNull(flightList);
        assertEquals(2,
                FilterFlight.filter
                        (new FilterFlightGroundTimeTwoHours(),flightList).size());

    }
}