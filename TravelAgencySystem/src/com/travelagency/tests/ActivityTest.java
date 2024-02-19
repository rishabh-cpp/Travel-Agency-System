package com.travelagency.tests;

import org.junit.jupiter.api.Test;

import com.travelagency.Activity;
import com.travelagency.Destination;

import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {
    @Test
    void testGetName() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 20.0, 50, destination);
        assertEquals("Eiffel Tower Visit", activity.getName());
    }

    @Test
    void testGetDescription() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 20.0, 50, destination);
        assertEquals("Visit the iconic Eiffel Tower", activity.getDescription());
    }

    @Test
    void testGetCost() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 20.0, 50, destination);
        assertEquals(20.0, activity.getCost());
    }

    @Test
    void testGetCapacity() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 20.0, 50, destination);
        assertEquals(50, activity.getCapacity());
    }

    @Test
    void testGetDestination() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 20.0, 50, destination);
        assertEquals(destination, activity.getDestination());
    }
}
