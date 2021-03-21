package com.gridnine.testing;
import java.time.LocalDateTime;
import java.util.*;
//1.	вылет до текущего момента времени
public class FilterFlightBeforeNow implements FlightFilterInt{
    @Override
    public List<Flight> filter(List<Flight> list) {
        List<Flight> filterFlights = new ArrayList<>();
        for(Flight f : list)
             if(f.getSegments().get(0).getDepartureDate().isBefore(LocalDateTime.now()))
                filterFlights.add(f);
        return filterFlights;
    }
}
