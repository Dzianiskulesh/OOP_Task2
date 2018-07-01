package Task2;

import java.util.ArrayList;
import java.util.Date;

public class Event {
    // TODO: DK: Обычно поля класса делают Private а доступ организовывают через геттеры и сеттеры
    public int id;
    public String title;
    public String place;
    public String description;
    public Date date;
    public String type;
    // TODO: DK: Коллекцию лучше объявлять интерфейсом, т.е.    public List<Ticket> eventTickets; В случае если например в будушем ты захочешь поменять ArrayList на LinkedList класс Event.java не нужно будет править.
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
