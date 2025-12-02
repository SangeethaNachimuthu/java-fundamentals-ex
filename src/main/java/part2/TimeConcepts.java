package part2;

import java.time.*;
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

        //Extract day of the week from DOB
        LocalDate dob = LocalDate.of(1990,01,18);
        DayOfWeek dayOfWeek = dob.getDayOfWeek();
        System.out.println("The day of the week is " +dayOfWeek);

        //Extract month after plus and mins methods
        LocalDate datePlusMinus = currentDay.plusYears(10).minusMonths(10);
        int dayOfMonth = datePlusMinus.getDayOfMonth();
        System.out.println("The month is " +dayOfMonth);

        //Elapsed year, month and days.
        Period period = Period.between(dob, datePlusMinus);
        System.out.println("Elapsed years: " + period.getYears());
        System.out.println("Elapsed months: " + period.getMonths());
        System.out.println("Elapsed days: " + period.getDays());

        //Adding period to the localDate.
        Period p = Period.of(4, 7, 29);
        LocalDate dateAdd = currentDay.plus(p);
        System.out.println("After adding the period, the date is " +dateAdd);

        //Create a localTime object for the current time.
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is " + currentTime);
        System.out.println("The nano seconds of current time is " + currentTime.getNano());

        //Print a LocalTime object from a String using parse method.
        String str1 = "05:16:59";
        DateTimeFormatter formater2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(str1, formater2);
        System.out.println("Parsed Local Time: " +time);

        //Format LocalTime from Current time and print it in 10:32:53 pattern
        System.out.println("Formatted current time is " + formater2.format(currentTime));

        //Create a LocalDateTime component
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("The current date and time is " + dateTime);
        System.out.println("The Date is " + dateTime.toLocalDate());
        System.out.println("The Time is " + dateTime.toLocalTime());

        //Formatted Date and Time in tuesday 5 april 10:00 pattern.
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE dd MMMM HH:mm");
        String formattedDateTime = dateTime.format(formatter3);
        System.out.println("The formatted Date and Time is " + formattedDateTime);

        //Create a LocalDateTime obj by combining LocalDate and LocalTime objects.
        LocalDate lDate = LocalDate.of(2016, 12, 8);
        LocalTime lTime = LocalTime.of(21,13);
        LocalDateTime lDateTime = LocalDateTime.of(lDate, lTime);
        System.out.println("Combining LocalDateTime is " + lDateTime);

        //Get the LocalDate and LocalTime objects from LocalDateTime object
        LocalDateTime ldt = LocalDateTime.of(2023,2,15,16,20);
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();
        System.out.println("Date is " + ld);
        System.out.println("Time is " + lt);
    }

}
