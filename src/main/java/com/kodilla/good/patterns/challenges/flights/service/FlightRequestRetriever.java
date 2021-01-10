package com.kodilla.good.patterns.challenges.flights.service;

import java.util.ArrayList;
import java.util.List;

public class FlightRequestRetriever {
    public FlightRequest retrieve(){
        Flight one = new Flight("Poznan", "Warszawa", "Gdansk");
        Flight two = new Flight("Warszawa", "Wroclaw", "Krakow");
        Flight three = new Flight("Berlin", "-", "Warszawa");
        Flight four = new Flight("Poznan", "Berlin", "Paryz");
        List<Flight> list = new ArrayList<>();
        {{
            list.add(one);
            list.add(two);
            list.add(three);
            list.add(four);
        }}
        return new FlightRequest(list);
    }
}
