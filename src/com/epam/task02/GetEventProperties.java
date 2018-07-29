package com.epam.task02;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GetEventProperties {
    public static final String PATH_TO_PROP = "src/com/epam/task02/event.properties";
    static FileInputStream fileInputStream;
    static Properties prop = new Properties();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,M,d");


    public static void loadEventProperties() {
        try {

            fileInputStream = new FileInputStream(PATH_TO_PROP);
            prop.load(fileInputStream);
        } catch (IOException e) {
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
