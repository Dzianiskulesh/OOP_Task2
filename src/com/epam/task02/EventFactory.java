package com.epam.task02;

import java.util.ArrayList;

public class EventFactory {
    public static ArrayList<Event> createEvents() {
        //Events list
        ArrayList<Event> allEvents = new ArrayList<>();

        //Load eventProperties
        GetEventProperties.loadEventProperties();

        //Create event and add to events list
        int i = 1;
        while(GetEventProperties.getTitle(i) != null) {
            allEvents.add(new Event(
                    GetEventProperties.getID(i),
                    GetEventProperties.getTitle(i),
                    GetEventProperties.getPlace(i),
                    GetEventProperties.getDescription(i),
                    GetEventProperties.getDate(i),
                    GetEventProperties.getType(i),
                    TicketFactory.createTickets(GetEventProperties.getID(i), GetEventProperties.getNumberOfTickets(i))
                    )
            );
            i++;
        }
        return allEvents;
    }
}
