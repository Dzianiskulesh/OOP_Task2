package Task2;

public class Ticket {
    public int eventId;
    public int seatNumber;
    public int price;
    public boolean isAvailable;

    public Ticket() {

    }
    public Ticket(int eventId, int seatNumber, int price, boolean isAvailable) {
        this.eventId = eventId;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isAvailable = isAvailable;
    }
}
