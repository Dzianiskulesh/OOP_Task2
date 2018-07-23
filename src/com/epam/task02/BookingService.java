package com.epam.task02;

import java.util.List;

public interface BookingService {
    int checkTicketsAvailable(Event event, int ticketsNeeded);
    List<Ticket> bookTickets(Event event, int ticketsNeeded);
}
