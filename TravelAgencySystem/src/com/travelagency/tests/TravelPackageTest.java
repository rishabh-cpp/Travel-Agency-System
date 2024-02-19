package com.travelagency.tests;

import org.junit.jupiter.api.Test;

import com.travelagency.Destination;
import com.travelagency.Passenger;
import com.travelagency.TravelPackage;

import static org.junit.jupiter.api.Assertions.*;

class TravelPackageTest {
    @Test
    void testAddDestination() {
        Destination destination = new Destination("Paris");
        TravelPackage travelPackage = new TravelPackage("Europe Tour", 10);
        travelPackage.addDestination(destination);
        assertEquals(1, travelPackage.getItinerary().size());
        assertEquals("Paris", travelPackage.getItinerary().get(0).getName());
    }

    @Test
    void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Europe Tour", 10);
        Passenger passenger = new Passenger("John", 12345);
        travelPackage.addPassenger(passenger);
        assertEquals(1, travelPackage.getPassengers().size());
        assertEquals(passenger, travelPackage.getPassengers().get(0));
    }
}
