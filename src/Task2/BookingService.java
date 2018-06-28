package Task2;

import java.util.ArrayList;

public class BookingService {

    //Check if tickets available
    public int checkTicketsAvailable(Event event, int ticketsNeeded) {
        int ticketsPrice = 0;
        ArrayList<Ticket> ticketsAvailable = new ArrayList<>();
        for (int i = 0; i < event.eventTickets.size(); i++) {
            if (event.eventTickets.get(i).isAvailable) {
                ticketsAvailable.add(event.eventTickets.get(i));
                ticketsPrice += event.eventTickets.get(i).price;
            }
        }
        if (ticketsAvailable.size() >= ticketsNeeded) {
            System.out.println("Total tickets price is: " + ticketsPrice);
            return ticketsPrice;
        } else {
            System.out.println("Sorry, this amount of tickets is not available!");
            return 0;
        }
    }

    public void bookTickets(Event event, int ticketsNeeded) {
        ArrayList<Ticket> ticketsAvailable = new ArrayList<>();
        for (int i = 0; i < event.eventTickets.size(); i++) {
            if (event.eventTickets.get(i).isAvailable) {
                ticketsAvailable.add(event.eventTickets.get(i));
            }
        }
        if (ticketsAvailable.size() >= ticketsNeeded) {
            for (int j = 0; j < ticketsAvailable.size(); j++) {
                ticketsAvailable.get(j).isAvailable = false;
            }
            System.out.println("You booked " + ticketsNeeded + " tickets!");
        } else {
            System.out.println("Sorry, this amount of tickets is not available!");
        }

    }
}
