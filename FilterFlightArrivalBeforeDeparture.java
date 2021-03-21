package com.gridnine.testing;

import java.util.*;
//2.	имеются сегменты с датой прилёта раньше даты вылета
public class FilterFlightArrivalBeforeDeparture implements FlightFilterInt {
    @Override
    public List<Flight> filter(List<Flight> list) {
        List<Flight> filterFlights = new ArrayList<>();
        for(Flight f : list)
            for(Segment s : f.getSegments())
                if(s.getArrivalDate().isBefore(s.getDepartureDate())) {
                    filterFlights.add(f);
                    break;
                }
                return filterFlights;
    }
}
