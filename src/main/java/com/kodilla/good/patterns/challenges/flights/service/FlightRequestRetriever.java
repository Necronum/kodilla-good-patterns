package com.kodilla.good.patterns.challenges.flights.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightRequestRetriever {
    public static List<Flight> retrieve(){
        Flight one = new Flight("Poznan", "Gdansk");
        Flight two = new Flight("Warszawa", "Krakow");
        Flight three = new Flight("Berlin", "Warszawa");
        Flight four = new Flight("Poznan", "Paryz");
        Flight five = new Flight("Gdansk", "Warszawa");
        Flight six = new Flight("Poznan", "Warszawa");
        Flight seven = new Flight("Krakow", "Warszawa");
        Flight eight = new Flight("Poznan", "Krakow");
        return Arrays.asList(one, two, three, four, five, six, seven, eight);
    }
}
