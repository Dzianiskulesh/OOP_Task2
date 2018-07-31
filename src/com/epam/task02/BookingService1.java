package com.epam.task02;

import java.util.ArrayList;
import java.util.List;

public class BookingService1 implements BookingService {

    //Check if tickets available
    public int checkTicketsAvailable(Event event, int ticketsNeeded) {
        int ticketsPrice = 0;
        ArrayList<Ticket> ticketsAvailable = new ArrayList<>();
        for (Ticket ticket: event.getEventTickets()) {
            if (ticket.isAvailable()) {
                ticketsAvailable.add(ticket);
            }
        }
        //Return price of needed tickets if available
        if (ticketsAvailable.size() >= ticketsNeeded) {
            ticketsPrice = ticketsAvailable.get(0).getPrice() * ticketsNeeded;
            System.out.println("Total tickets price is: " + ticketsPrice);
            return ticketsPrice;
        } else {
            System.out.println("Sorry, this amount of tickets is not available!");
            return 0;
        }
    }

    public List<Ticket> bookTickets(Event event, int ticketsNeeded) {
        /**
         *   TODO: DK: Код который находит свободное количество билетов, используется в обоих методах  "checkTicketsAvailable" и "bookTickets".
         *   Можно было бы сделать приватный метод и вынести этот код туда.
         *
          */

        List<Ticket> ticketsAvailable = new ArrayList<>();
        for (int i = 0; i < event.getEventTickets().size(); i++) {
            if (event.getEventTickets().get(i).isAvailable()) {
                ticketsAvailable.add(event.getEventTickets().get(i));
            }
        }
        if (ticketsAvailable.size() >= ticketsNeeded) {
            for (int j = 0; j < ticketsAvailable.size(); j++) {
                ticketsAvailable.get(j).setAvailable(false);
            }
            System.out.println("You booked " + ticketsNeeded + " tickets!");
            // TODO: DK: похожее было в другом методе у тебя. Получается что метод возвращает все билеты которые были свободны до букинга. По названию и логике ожидается что метод доложен возвращать забранированные билеты.
            return ticketsAvailable;
        } else {
            System.out.println("Sorry, this amount of tickets is not available!");
            return null;
        }

    }
}
