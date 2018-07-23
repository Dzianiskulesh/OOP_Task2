package com.epam.task02;

public class Ticket {
    private int eventId;
    private int seatNumber;
    private int price;
    private boolean isAvailable;

    public Ticket(int eventId, int seatNumber, int price, boolean isAvailable) {
        this.eventId = eventId;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    //Getters
    public int getEventId() {
        return eventId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //Setters
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
