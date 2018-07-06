package Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Create events

        //Create tickets - Kirkorov Concert
        // TODO: DK: Создание ивентов можно вынести в отдельный класс чтобы разгружить метод main. В Main можно оставить что-то типо EventFactory.createEvents()
        ArrayList<Ticket> kirkorovTickets = new ArrayList<>();
        // TODO: DK: если int начинается с 0 (seatNumber) то это означает число в восьмиричной системе счисления, наверное это не то что ты хотел сделать :)
        Ticket kirkorovTicket01 = new Ticket(1, 01, 12, false);
        Ticket kirkorovTicket02 = new Ticket(1, 02, 12, true);
        Ticket kirkorovTicket03 = new Ticket(1, 03, 12, false);
        kirkorovTickets.add(kirkorovTicket01);
        kirkorovTickets.add(kirkorovTicket02);
        kirkorovTickets.add(kirkorovTicket03);

        //Create Kirkorov Concert
        // TODO: В java 8 добавился новый пакет для работы с датами java.time. Стало удобнее работать с датами     LocalDate kirkorovDate = LocalDate.of(2018, 6, 29);
        Date kirkorovDate = new Date(1530219600000L); // 29 JUN 2018

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
        Ticket avengersTicket01 = new Ticket(2, 01, 8, true);
        Ticket avengersTicket02 = new Ticket(2, 02, 8, true);
        Ticket avengersTicket03 = new Ticket(2, 03, 8, false);
        avengersTickets.add(avengersTicket01);
        avengersTickets.add(avengersTicket02);
        avengersTickets.add(avengersTicket03);

        //Create The Avengers Cinema
        Date avengersDate = new Date(1534021200000L); // 12 AUG 2018

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

        //Search service
        EventService search = new EventService();
        search.findEventsByPlace(allEvents, "Moscow");
        search.findEventsWithTickets(allEvents);
        // TODO: DK: При такой записи и работе с датами большое значение имеет локально и язык пользователя. Например у меня падает с эксепшеном т.к. русская OS. В моём случае нужно писать было бы "29 Июн 2018"
        search.findEventsByDate(allEvents, "29 JUN 2018");

        //Booking service
        BookingService booking = new BookingService();
        booking.checkTicketsAvailable(concertKirkorov, 1);
        booking.bookTickets(avengersCinema, 2);

    }
}
