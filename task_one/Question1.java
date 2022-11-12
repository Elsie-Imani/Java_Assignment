package task_one;

//Scanner import
import java.util.Scanner;

public class Question1 {

    // main method
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // My variables
        String surname;
        String oddeven;
        int age;
        int numCharacters;

        System.out.println("Enter your surname :");
        surname = input.nextLine(); // input name

        System.out.println("Enter your age :");
        age = input.nextInt(); // input age

        // Finding number of characters in surname
        numCharacters = surname.length();
        //determine if even or odd
        if (age % 2 == 0) {
            // age is even
            oddeven = "even";
        } else {
            // age is odd
            oddeven = "odd";
        }
        //output
        System.out.println("Your surname has : " + numCharacters + " characters");
        System.out.println("Your age is an " + oddeven + " number.");
    }
}