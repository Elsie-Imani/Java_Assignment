package Question1.methods_in_java.methods;

import java.util.Scanner;

public class Methods {

    // main method
    public static void main(String[] args) {

        // my variables
        double num1, num2, num3, smallnum, largenum;

        Scanner input = new Scanner(System.in);// scanner object

        // input first number
        System.out.println("\nEnter the first number: ");
        num1 = input.nextInt();
        // input second number
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        // input third number
        System.out.println("Enter the third number: ");
        num3 = input.nextInt();

        // get return values fom the methods
        smallnum = smallNum(num1, num2, num3);
        largenum = largeNum(num1, num2, num3);

        // output
        System.out.println("\nThe smallest number: " + smallnum);
        System.out.println("The largest number: " + largenum);
        System.out.println(largenum + " is your largest and " + smallnum + " is the smallest number.");
    }

    // get the smallest number
    static double smallNum(double num1, double num2, double num3) {

        if (num1 < num2) {
            if (num1 < num3) {
                // if true, return num1
                return num1;
            } else {
                // else false, return num3
                return num3;
            }
        } else {
            if (num2 < num3) {
                // if true, return num2
                return num2;
            } else {
                // else false, return num3
                return num3;
            }
        }
    }

    // get largest number
    static double largeNum(double num1, double num2, double num3) {

        if (num1 > num2) {
            if (num1 > num3) {
                // if true, return num1
                return num1;
            } else {
                // else false, return num3
                return num3;
            }
        } else {
            if (num2 > num3) {
                // if true, return num2
                return num2;
            } else {
                // else false, return num3
                return num3;
            }
        }
    }

}
