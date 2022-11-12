package task_one;

import java.util.Scanner; //importing Scanner

public class Question2 {

    // main function
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // my Scanner object

        // my variables
        double unit_1, unit_2, unit_3, unit4, unit_5, average;

        System.out.println("To get your average mark for last semester, fill in the following.");
        // inputting the five units
        System.out.println("\nUnit 1 : ");
        unit_1 = input.nextDouble();
        System.out.println("Unit 2 : ");
        unit_2 = input.nextDouble();
        System.out.println("Unit 3 : ");
        unit_3 = input.nextDouble();
        System.out.println("Unit 4 : ");
        unit4 = input.nextDouble();
        System.out.println("Unit 5 : ");
        unit_5 = input.nextDouble();

        // get rounded average mark
        average = findAverage(unit_1, unit_2, unit_3, unit4, unit_5);

        // Dispalying output
        System.out.println("\nYour average mark : " + average);
    }

    static double findAverage(double unit_1, double unit_2, double unit_3, double unit4, double unit_5) {

        // get the average
        var myAverage = (unit_1 + unit_2 + unit_3 + unit4 + unit_5) / 5;

        // round the average
        var roundAverage = Math.round(myAverage * 100.0) / 100.0;
        return roundAverage;
    }
}