package com.epam.task02;

import java.time.LocalDate;
import java.util.*;

// TODO: DK: Так как это сервис более правильно было бы чтобы сервис сам брал где-то билеты, а не клиент передавал их ему. Например билеты бы передавались в конструкторе при создании сервиса.
public class EventService1 implements EventService {

    //Find Event by place
    public ArrayList<Event> findEventsByPlace(ArrayList<Event> allEvents, EventPlace place) {
        ArrayList<Event> results = new ArrayList<>();
        // TODO: DK: Тут удобнее было бы foreach использовать, более компактно и  не нужно несколько раз вызывать "allEvents.get(i)"
        for (int i = 0; i < allEvents.size(); i++) {
            if (allEvents.get(i).getPlace().contains(place.name())) {
                results.add(allEvents.get(i));
            }
        }
        if (results.size() > 0) {
            System.out.println("Найдены мероприятия в этом месте (" + place + ")" + ":");
            for (int i = 0; i < results.size(); i++) {
                System.out.println(i+1 + ". " + results.get(i).getTitle());
            }
            return results;
        } else {
            System.out.println("Мероприятий в этом месте не найдено!");
        }
        // TODO: DK: если метод возвращает коллекцию (List) удобнее было бы возвращать пустую коллекцию чем лист. Потом можно не проверять на NULL а сразу итерировать по коллекции foreach. В случае пустой коллекции просто ничего не будет выполняться.
        return null;
    }

    //Find Event with available tickets
    public ArrayList<Event> findEventsWithTickets(ArrayList<Event> allEvents) {
        ArrayList<Event> results2 = new ArrayList<>();
        for (int i = 0; i < allEvents.size(); i++) {
            List<Ticket> tickets = allEvents.get(i).getEventTickets();
            for (int j = 0; j < tickets.size(); j++) {
                if (tickets.get(j).isAvailable()) {
                    results2.add(allEvents.get(i));
                    break;
                }
            }
        }
        if (results2.size() > 0) {
            System.out.println("Найдены мероприятия со свободными местами:");
            for (int i = 0; i < results2.size(); i++) {
                System.out.println(i+1 + ". " + results2.get(i).getTitle());
            }
            return results2;
        } else {
            System.out.println("Мероприятий со свободными местами нет!");
        }
        // TODO: DK: тоже лучше возвращать пустоую коллекцию.
        return null;
    }

    //Find Event by date
    public ArrayList<Event> findEventsByDate(ArrayList<Event> allEvents, LocalDate date) {
        ArrayList<Event> results3 = new ArrayList<>();
        for(int i = 0; i < allEvents.size(); i++) {
            if (allEvents.get(i).getDate().isEqual(date)) {
                results3.add(allEvents.get(i));
            }
        }
        if (results3.size() > 0) {
            System.out.println("Найдены мероприятия на эту дату (" + date + "):");
            for (int i = 0; i < results3.size(); i++) {
                System.out.println(i+1 + ". " + results3.get(i).getTitle());
            }
            return results3;
        } else {
            System.out.println("Мероприятий в этот день нет!");
        }
        return null;
    }
}
