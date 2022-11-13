package Question3.leapyear;

import java.util.Scanner;

public class LeapYear {

    // the main method
    public static void main(String[] args) {
        checkLeapYear(); // calling the method beloww
    }

    // the method to find leap year
    static void checkLeapYear() {

        // variable to store year
        int year;
        // scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year :");
        year = input.nextInt(); // input year

        // is year leap or not
        if ((year % 4) == 0) {
            //if yes
            System.out.println(year + " is a leap year");
        } else {
            //if not
            System.out.println(year + " is not a leap year");
        }
    }

}
