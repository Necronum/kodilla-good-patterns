package com.kodilla.good.patterns.challenges.flights.service;

public class FlightProcessor {
    public static final String DEPARTURE = "Poznan";
    public static final String ARRIVAL = "Warszawa";
    public static final String THROUGH = "Berlin";

    public void departureAirportFinder(FlightRequest flightRequest){
        System.out.println("\n Flights that start from: " + DEPARTURE);
        System.out.println("Departure -> InterAirport -> Arrival");
        flightRequest.getFlightList().stream()
                .filter(s -> s.getDepartureAirport().equals(DEPARTURE))
                .map(s -> s.getDepartureAirport() + " -> " + s.getFlightThrough() + " -> " + s.getArrivalAirport())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public void arrivalAirportFinder(FlightRequest flightRequest){
        System.out.println("\n Flights that ends in: " + ARRIVAL);
        System.out.println("Departure -> InterAirport -> Arrival");
        flightRequest.getFlightList().stream()
                .filter(s -> s.getArrivalAirport().equals(ARRIVAL))
                .map(s -> s.getDepartureAirport() + " -> " + s.getFlightThrough() + " -> " + s.getArrivalAirport())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public void flightThroughFinder(FlightRequest flightRequest){
        System.out.println("\n Flights that goes through: " + THROUGH);
        System.out.println("Departure -> InterAirport -> Arrival");
        flightRequest.getFlightList().stream()
                .filter(s -> s.getFlightThrough().equals(THROUGH))
                .map(s -> s.getDepartureAirport() + " -> " + s.getFlightThrough() + " -> " + s.getArrivalAirport())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}


