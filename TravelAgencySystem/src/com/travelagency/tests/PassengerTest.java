package com.travelagency.tests;

import org.junit.jupiter.api.Test;

import com.travelagency.Passenger;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    @Test
    void testGetName() {
        Passenger passenger = new Passenger("John", 12345);
        assertEquals("John", passenger.getName());
    }

    @Test
    void testGetPassengerNumber() {
        Passenger passenger = new Passenger("John", 12345);
        assertEquals(12345, passenger.getPassengerNumber());
    }

    @Test
    void testGetBalance() {
        Passenger passenger = new Passenger("John", 12345);
        assertEquals(0, passenger.getBalance());
    }

    @Test
    void testSetBalance() {
        Passenger passenger = new Passenger("John", 12345);
        passenger.setBalance(100.0);
        assertEquals(100.0, passenger.getBalance());
    }
}
