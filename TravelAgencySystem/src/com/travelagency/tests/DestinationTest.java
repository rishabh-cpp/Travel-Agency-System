package com.travelagency.tests;

import org.junit.jupiter.api.Test;

import com.travelagency.Activity;
import com.travelagency.Destination;

import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {
    @Test
    void testGetName() {
        Destination destination = new Destination("Paris");
        assertEquals("Paris", destination.getName());
    }

    @Test
    void testAddActivity() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 20.0, 50, destination);
        destination.addActivity(activity);
        assertEquals(1, destination.getActivities().size());
        assertEquals(activity, destination.getActivities().get(0));
    }
}
