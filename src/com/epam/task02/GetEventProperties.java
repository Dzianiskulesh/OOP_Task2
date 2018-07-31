package com.epam.task02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GetEventProperties {
    public static final String PATH_TO_PROP = "src/com/epam/task02/event.properties";
    static FileInputStream fileInputStream;
    // TODO: DK : Если поля класса не планируется использовать из вне то лучше делать их private. Static тоже может быть private.
    static Properties prop = new Properties();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,M,d");


    public static void loadEventProperties() {
        // TODO: DK: В джаве есть такая штука как статичексие блоки пишется как "static {} ". Тут можно его использовать. Идея в том что не очень очевидно что перед тем как обратиться к проперти нужно вызвать метод loadEventProperties()
        try {

            fileInputStream = new FileInputStream(PATH_TO_PROP);
            prop.load(fileInputStream);
        } catch (IOException e) {
            // TODO: DK: В данном случае получается что если файл чтения пропертей недоступен мы всё равно не сможем выполнять программу. Т.е. в обработке мы всё равно не сможем ничего сделать. В таком случае можно выбросить runtime exteption или свой кастомный.
            e.printStackTrace();
        }
    }

    public static int getID(int index) {
        return Integer.parseInt(prop.getProperty("id"+ index));
    }
    public static String getTitle(int index){
        return prop.getProperty("title"+ index);
    }
    public static String getPlace(int index) {
        return prop.getProperty("place"+ index);
    }
    public static String getDescription(int index) {
        return prop.getProperty("decription"+ index);
    }
    public static String getType(int index) {
        return prop.getProperty("type"+ index);
    }
    public static LocalDate getDate(int index) {
        return LocalDate.parse(prop.getProperty("date"+ index), formatter);
    }
    public static int getNumberOfTickets(int index) {
        return Integer.parseInt(prop.getProperty("ticketsNumber"+ index));
    }

}
