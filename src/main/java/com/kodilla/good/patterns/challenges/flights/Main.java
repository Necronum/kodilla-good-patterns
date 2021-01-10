package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.service.FlightProcessor;
import com.kodilla.good.patterns.challenges.flights.service.FlightRequest;
import com.kodilla.good.patterns.challenges.flights.service.FlightRequestRetriever;

public class Main {
    public static void main(String[] args){
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        FlightProcessor processor = new FlightProcessor();
        processor.departureAirportFinder(flightRequest);
        processor.arrivalAirportFinder(flightRequest);
        processor.flightThroughFinder(flightRequest);
    }
}
