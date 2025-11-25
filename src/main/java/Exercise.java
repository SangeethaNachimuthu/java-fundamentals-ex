import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        /*
        Exercise 1: Print Hello and Name.
        * */
        System.out.println("Hello");
        System.out.println("Sangeetha!");

        leapYear();    //Exercise 2


    }
    /*
    Exercise 2: Get a year as input and print if is a leap year or not.
     */
    public static void leapYear(){
         System.out.println("Enter the year: ");
         Scanner scanner = new Scanner(System.in);
         int year = scanner.nextInt();
         if (year % 4 == 0){
             System.out.println("The "+ year + " is a leap year.");
         }
         else {
             System.out.println("The " + year + " is not a leap year.");
         }
    }
}
