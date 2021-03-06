package Task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EventService {

    //Find Event by place
    public void findEventsByPlace(ArrayList<Event> allEvents, String place) {
        ArrayList<Event> results = new ArrayList<>();
        for (int i = 0; i < allEvents.size(); i++) {
            if (allEvents.get(i).place.contains(place)) {
                results.add(allEvents.get(i));
            }
        }
        if (results.size() > 0) {
            System.out.println("Найдены мероприятия в этом месте (" + place + ")" + ":");
            for (int i = 0; i < results.size(); i++) {
                System.out.println(i+1 + ". " + results.get(i).title);
            }
        } else {
            System.out.println("Мероприятий в этом месте не найдено!");
        }
    }

    //Find Event with available tickets
    public void findEventsWithTickets(ArrayList<Event> allEvents) {
        ArrayList<Event> results2 = new ArrayList<>();
        for (int i = 0; i < allEvents.size(); i++) {
            ArrayList<Ticket> tickets = allEvents.get(i).eventTickets;
            for (int j = 0; j < tickets.size(); j++) {
                if (tickets.get(j).isAvailable) {
                    results2.add(allEvents.get(i));
                    break;
                }
            }
        }
        if (results2.size() > 0) {
            System.out.println("Найдены мероприятия со свободными местами:");
            for (int i = 0; i < results2.size(); i++) {
                System.out.println(i+1 + ". " + results2.get(i).title);
            }
        } else {
            System.out.println("Мероприятий со свободными местами нет!");
        }
    }

    //Find Event by date
    public void findEventsByDate(ArrayList<Event> allEvents, String date) {
        ArrayList<Event> results3 = new ArrayList<>();
        SimpleDateFormat f = new SimpleDateFormat("dd MMM yyyy");
        long milliseconds = 0;
        try {
            Date d = f.parse(date);
            milliseconds = d.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < allEvents.size(); i++) {
            if (allEvents.get(i).date.getTime() == milliseconds) {
                results3.add(allEvents.get(i));
            }
        }
        if (results3.size() > 0) {
            System.out.println("Найдены мероприятия на эту дату (" + date + "):");
            for (int i = 0; i < results3.size(); i++) {
                System.out.println(i+1 + ". " + results3.get(i).title);
            }
        } else {
            System.out.println("Мероприятий в этот день нет!");
        }
    }
}
