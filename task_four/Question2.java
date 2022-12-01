import java.util.Scanner; //importing Scanner function

public class Question2 {
    // static Scanner object
    static Scanner input = new Scanner(System.in);

    // A prime number,number divisible by 1 and itself
    static void isPrime() {

        System.out.println("Enter an integer number to check if it is prime or not: ");
        var numberToTest = input.nextInt();

        boolean flag = false;
        for (int i = 2; i <= numberToTest / 2; ++i) {
            // cross checking for nonprime number
            if (numberToTest % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(numberToTest + " is a prime number.");
        else
            System.out.println(numberToTest + " is not a prime number.");

    }

    // this main method is used to display prime numbers between 1 to 500.
    public static void main(String[] args) {

        int i = 0;
        int myNumber = 0;
        // string has no value
        String primeNumbers = "";

        for (i = 1; i <= 500; i++) {
            int counter = 0;
            for (myNumber = i; myNumber >= 1; myNumber--) {
                if (i % myNumber == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                // instantiate the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("The prime numbers from 1 to 500 are :");
        System.out.println(primeNumbers);

        // calling the isPrime method in the main method
        isPrime();
    }
}