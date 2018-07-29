package com.epam.task02;

import java.util.ArrayList;

public class TicketFactory {

    public static ArrayList<Ticket> createTickets(int eventId, int numberOfTickets) {
        //Create tickets list
        ArrayList<Ticket> eventTickets = new ArrayList<>();

        //Create ticket
        for(int i = 0; i < numberOfTickets; i++) {
            eventTickets.add(new Ticket(
                    eventId,
                    i+1,
                    10,
                    true
                    )
            );
        }
        return eventTickets;
    }
}
