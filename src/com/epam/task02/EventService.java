package com.epam.task02;

import java.util.ArrayList;

public interface EventService {
    ArrayList<Event> findEventsByPlace(ArrayList<Event> allEvents, String place);
    ArrayList<Event> findEventsWithTickets(ArrayList<Event> allEvents);
}
