package com.gridnine.testing;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
//3.общее время, проведённое на земле превышает два часа
// (время на земле — это интервал между прилётом
// одного сегмента и вылетом следующего за ним)
public class FilterFlightGroundTimeTwoHours implements FlightFilterInt {
    @Override
    public List<Flight> filter(List<Flight> list) {
        List<Flight> flightFilter = new ArrayList<>();
        for (Flight f : list)
            for(int i = 0; i < f.getSegments().size() - 1; i++) {
                LocalDateTime arrivalTime = f.getSegments().get(i).getArrivalDate();
                LocalDateTime departureTime = f.getSegments().get(i + 1).getDepartureDate();
                long groundTime = ChronoUnit.HOURS.between(arrivalTime, departureTime);
                if(groundTime >= 2) {
                    flightFilter.add(f);
                break;
                }
            }
        return flightFilter;
    }
}
