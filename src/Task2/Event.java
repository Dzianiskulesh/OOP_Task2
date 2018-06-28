package Task2;

import java.util.ArrayList;
import java.util.Date;

public class Event {
    public int id;
    public String title;
    public String place;
    public String description;
    public Date date;
    public String type;
    public ArrayList<Ticket> eventTickets;

    public Event() {

    }
    public Event(int id, String title, String place, String description, Date date, String type, ArrayList<Ticket> eventTickets) {
        this.id = id;
        this.title = title;
        this.place = place;
        this.description = description;
        this.date = date;
        this.type = type;
        this.eventTickets = eventTickets;
    }
}
