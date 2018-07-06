// TODO: DK: Имя пакета принято начинать с домена компании "com.epam", также обычно пакеты называют маленькими буквами.

package Task2;

public class Ticket {
    // TODO: DK: Обычно поля класса делают Private а доступ организовывают через геттеры и сеттеры
    public int eventId;
    public int seatNumber;
    public int price;
    public boolean isAvailable;

    // TODO: DK: Похоже что конструктор по умолчанию нигде не используется и не будет, в этом случае его можно не объявлять.
    public Ticket() {

    }

    public Ticket(int eventId, int seatNumber, int price, boolean isAvailable) {
        this.eventId = eventId;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isAvailable = isAvailable;
    }
}
