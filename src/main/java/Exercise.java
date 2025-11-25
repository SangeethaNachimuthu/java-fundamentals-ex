import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        /*
        Exercise 1: Print Hello and Name.
        * */
        System.out.println("Hello");
        System.out.println("Sangeetha!");

        leapYear();    //Exercise 2

        arithmeticOperations();     //Exercise 3


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

    /*
    Exercise 3: Arithmetic Operations
     */
    public static void arithmeticOperations(){
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition of 46+12 = "+(46+12));
        System.out.println("Subtraction of 56-13 = "+(56-13));
        System.out.println("Multiplication of 13*5 = "+(13*5));
        System.out.println("Division of 25/7 = "+(25/7));
    }
}
