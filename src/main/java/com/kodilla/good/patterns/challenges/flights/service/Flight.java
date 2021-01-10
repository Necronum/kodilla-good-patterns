package com.kodilla.good.patterns.challenges.flights.service;

import java.util.Objects;

public class Flight {
    private String departureAirport;
    private String flightThrough;
    private String arrivalAirport;

    public Flight(String departureAirport, String interAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.flightThrough = interAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getFlightThrough() {
        return flightThrough;
    }

    public void setFlightThrough(String flightThrough) {
        this.flightThrough = flightThrough;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(flightThrough, flight.flightThrough) && Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, flightThrough, arrivalAirport);
    }
}
