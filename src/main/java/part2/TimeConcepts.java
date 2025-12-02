package part2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeConcepts {

    void main() {

        // Print the current day.
        LocalDate currentDay = LocalDate.now();
        System.out.println("Current Date is " + currentDay);

        // Print the date in the formate 'Tuesday 29 Mar'
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMM");
        String formatedDate = currentDay.format(dateTimeFormatter);
        System.out.println(formatedDate);

        //Print the entire week from last monday.
        LocalDate lastMonday = LocalDate.of(2025, 12, 01);
        System.out.println("Last Monday is :" + lastMonday);
        for(int i=1; i<7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }

        //Print a LocalDate object from a String using parse method.
        String str = "14/10/2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(str, formatter);
        System.out.println("Parsed Local Date: " +date);
        System.out.println("Formatted Local Date: " +formatter.format(date));
    }

}
