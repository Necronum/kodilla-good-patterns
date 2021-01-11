package com.kodilla.good.patterns.challenges.flights.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private final List<Flight> flights = FlightRequestRetriever.retrieve();

    public List<Flight> allFlightsFrom(String departureAirport){
        return flights.stream()
                .filter(s -> departureAirport.equals(s.getDepartureAirport()))
                .collect(Collectors.toList());
    }

    public List<Flight> allFlightsTo(String arrivalAirport){
        return flights.stream()
                .filter(s -> arrivalAirport.equals(s.getArrivalAirport()))
                .collect(Collectors.toList());
    }

    public List<List<Flight>> inBetweenFlights(String departureAirport, String arrivalAirport){
        List<Flight> flightsFromList = allFlightsFrom(departureAirport);

        List<Flight> flightsToList = allFlightsTo(arrivalAirport);

        List<Flight> directFlightList = flightsFromList.stream()
                .filter(s -> departureAirport.equals(s.getDepartureAirport()) &&
                        arrivalAirport.equals(s.getArrivalAirport()))
                .collect(Collectors.toList());

        List<Flight> indirectFlightList = flightsFromList.stream()
                .filter(s -> flightsToList.contains(new Flight(s.getArrivalAirport(), arrivalAirport)))
                .collect(Collectors.toList());

        List<List<Flight>> listOfFlights = new ArrayList<>();
        listOfFlights.add(directFlightList);

        for (Flight flight: indirectFlightList){
            List<Flight> listOfIndirectFlights = new ArrayList<>();
            listOfIndirectFlights.add(flight);
            flightsToList.stream()
                    .filter(s -> flight.getArrivalAirport().equals(s.getDepartureAirport()))
                    .forEachOrdered(listOfIndirectFlights::add);
            listOfFlights.add(listOfIndirectFlights);
        }
        return listOfFlights;
    }
}
