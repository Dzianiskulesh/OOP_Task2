package com.epam.task02;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Create events
        ArrayList<Event> allEvents = EventFactory.createEvents();

        //Search service
        EventService1 search = new EventService1();
        search.findEventsByPlace(allEvents, EventPlace.Lida);
        search.findEventsWithTickets(allEvents);
        search.findEventsByDate(allEvents, LocalDate.of(2018, 6, 18));

        //Booking service
        BookingService1 booking = new BookingService1();
        booking.checkTicketsAvailable(allEvents.get(0), 1);
        booking.bookTickets(allEvents.get(1), 2);

        System.out.println("Total amount of events: " + allEvents.size());
    }
}
