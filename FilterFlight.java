package com.gridnine.testing;

import java.util.*;

public class FilterFlight {
    public static List<Flight> filter(FlightFilterInt filter, List<Flight> flights) {
        return filter.filter(flights);
    }
}
