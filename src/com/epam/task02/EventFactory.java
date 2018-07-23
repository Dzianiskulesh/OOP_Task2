package com.epam.task02;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventFactory {
    public static ArrayList<Event> createEvents() {

        //Create tickets - Kirkorov Concert
        ArrayList<Ticket> kirkorovTickets = new ArrayList<>();
        Ticket kirkorovTicket01 = new Ticket(1, 1, 12, false);
        Ticket kirkorovTicket02 = new Ticket(1, 2, 12, true);
        Ticket kirkorovTicket03 = new Ticket(1, 3, 12, false);
        kirkorovTickets.add(kirkorovTicket01);
        kirkorovTickets.add(kirkorovTicket02);
        kirkorovTickets.add(kirkorovTicket03);

        //Create Kirkorov Concert
        LocalDate.of(2018, 6, 29);
        //Date kirkorovDate = new Date(1530219600000L); // 29 JUN 2018
        LocalDate kirkorovDate = LocalDate.of(2018, 6, 29);

        Event concertKirkorov = new Event(
                1,
                "Kirkorov - 50 years on stage",
                "Moscow, Russia",
                "Concert dedicated to 50 years of singing career of Filipp Kirkorov",
                kirkorovDate,
                "Concert",
                kirkorovTickets);

        //Create tickets - The Avengers Cinema
        ArrayList<Ticket> avengersTickets = new ArrayList<>();
        Ticket avengersTicket01 = new Ticket(2, 1, 8, true);
        Ticket avengersTicket02 = new Ticket(2, 2, 8, true);
        Ticket avengersTicket03 = new Ticket(2, 3, 8, false);
        avengersTickets.add(avengersTicket01);
        avengersTickets.add(avengersTicket02);
        avengersTickets.add(avengersTicket03);

        //Create The Avengers Cinema
        //Date avengersDate = new Date(1534021200000L); // 12 AUG 2018
        LocalDate avengersDate = LocalDate.of(2018, 8, 12);

        Event avengersCinema = new Event(
                1,
                "The Avengers: Infinity War",
                "Minsk, Belarus",
                "The Avengers: Part 3. Infinity War",
                avengersDate,
                "Cinema",
                avengersTickets);

        //Events list
        ArrayList<Event> allEvents = new ArrayList<>();
        allEvents.add(concertKirkorov);
        allEvents.add(avengersCinema);
        return allEvents;
    }


}
