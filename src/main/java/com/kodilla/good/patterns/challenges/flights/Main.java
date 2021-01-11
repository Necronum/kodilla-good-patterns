package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.service.Flight;
import com.kodilla.good.patterns.challenges.flights.service.FlightService;

import java.util.List;

public class Main {
    public static void main(String[] args){
        FlightService flightService = new FlightService();
        System.out.println("All flights from Poznan: ");
        List<Flight> flightsFromList = flightService.allFlightsFrom("Poznan");
        System.out.println(flightsFromList);

        System.out.println("\nAll flight to Warszawa: ");
        List<Flight> flightToList = flightService.allFlightsTo("Warszawa");
        System.out.println(flightToList);

        System.out.println("\nFlights from Poznan to Warszawa: ");
        List<List<Flight>> flightList = flightService.inBetweenFlights("Poznan", "Warszawa");
        System.out.println(flightList);
    }
}
