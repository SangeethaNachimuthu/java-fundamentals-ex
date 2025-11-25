import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        /*
        Exercise 1: Print Hello and Name.
        * */
        System.out.println("Hello");
        System.out.println("Sangeetha!");

        findLeapYear();    //Exercise 2

        arithmeticOperations();     //Exercise 3

        findAverage();      //Exercise 4

        getAndDisplayUserName();    //Exercise 5

        performArithmeticOperations();  //Exercise 6

        convertToSeconds();     //Exercise 7

        generateRandomNo();     //Exercise 8
    }
    /*
    Exercise 2: Get a year as input and print if is a leap year or not.
     */
    public static void findLeapYear(){
         System.out.println("Enter the year: ");
         Scanner scanner = new Scanner(System.in);
         int year = scanner.nextInt();
         if (year % 400 == 0){
             System.out.println("The "+ year + " is a leap year.");
         } else if (year % 4 == 0 && year % 100 != 0) {
              System.out.println("The "+ year + " is a leap year.");
         } else {
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

    /*
    Exercise 4: Print the average of three numbers
     */
    public static void findAverage() {
        int a = 27;
        int b = 56;
        int c = 12;
        int sum, average;

        sum = a+b+c;
        average = sum / 3;

        System.out.println("The average of "+a+","+b+" and "+c+" is "+average);

    }

    /*
    Exercise 5: Get the name from the user and print Hello username.
     */
    public static void getAndDisplayUserName() {

        System.out.println("Enter the username: ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.next();
        System.out.println("Hello "+userName);
    }

    /*
    Exercise 6: Get 2 inputs from user and perform Arithmetic Operations
     */
    public static void performArithmeticOperations() {

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter number A: ");
         int a = scan.nextInt();
         System.out.println("Enter number B: ");
         int b = scan.nextInt();

         System.out.println("Addition : " +a+ "+" +b+ "=" +(a+b));
         System.out.println("Subtraction : " +a+ "-" +b+ "=" +(a-b));
         System.out.println("Multiplication : " +a+ "*" +b+ "=" +(a*b));
         System.out.println("Division : " +a+ "/" +b+ "=" +(a/b));
    }

    /*
    Exercise 7: Convert seconds to hours, minutes and seconds
     */
    public static void convertToSeconds() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time in seconds: ");
        int seconds = scan.nextInt();

        int hr = seconds/3600;
        int min = (seconds/60) % 60;
        int sec = seconds % 60;

        //Used 'printf' to print formatted output.
        System.out.printf("%02d:%02d:%02d", hr, min, sec);
    }

    /*
    Exercise 8: Generate random number, let the user guess the number,
        run the program until the correct guess and print the no of attempt
        with correct guess message. Also display 'Guess is small / big' message
        based on the random number.
     */
    public static void generateRandomNo() {
        int ranNumber = (int) (Math.random() * 500)+1;
        //System.out.println(ranNumber);
        int guessNum;
        int noOfAtt=0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Guess the random number (between 1 to 500): ");
            guessNum = scan.nextInt();
            noOfAtt++;
            if(guessNum > ranNumber) {
                System.out.println("Your guess was too big.");
            } else if (guessNum < ranNumber) {
                System.out.println("Your guess was too small.");
            }
        }
        while(guessNum != ranNumber);
        System.out.println("Your guess is correct on " +noOfAtt+ " attempt.");
    }
}
