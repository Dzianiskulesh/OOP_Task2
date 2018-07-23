package com.epam.task02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {
    private int id;
    private String title;
    private String place;
    private String description;
    private LocalDate date;
    private String type;
    private List<Ticket> eventTickets;

    public Event() {

    }
    public Event(int id, String title, String place, String description, LocalDate date, String type, ArrayList<Ticket> eventTickets) {
        this.id = id;
        this.title = title;
        this.place = place;
        this.description = description;
        this.date = date;
        this.type = type;
        this.eventTickets = eventTickets;
    }
    //Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public List<Ticket> getEventTickets() {
        return eventTickets;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEventTickets(List<Ticket> eventTickets) {
        this.eventTickets = eventTickets;
    }
}
