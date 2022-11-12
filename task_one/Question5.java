package task_one;

import java.util.Scanner; //importing Scanner

public class Question5 {
    public static void main(String[] args) {

        // my variables
        Double first_num, second_num, result;
        char myOperator;

        Scanner input = new Scanner(System.in); // Scanner object

        // input first number
        System.out.println("Enter the first number");
        first_num = input.nextDouble();

        // input operator

        System.out.println("Type one of these signs as your operator: +, -, *, or /, and hit Enter.");
        myOperator = input.next().charAt(0);

        // input last number
        System.out.println("Enter last number");
        second_num = input.nextDouble();

        if (myOperator == '-') {
            result = first_num - second_num;
                System.out.println(first_num + " - " + second_num + " = " + result);
        }
        if (myOperator == '+') {
            result = first_num + second_num;
                System.out.println(first_num + " + " + second_num + " = " + result);
        }
        if (myOperator == '*') {
            result = first_num * second_num;
                System.out.println(first_num + " * " + second_num + " = " + result);
        }
        if (myOperator == '/') {
            result = first_num / second_num;
                System.out.println(first_num + " / " + second_num + " = " + result);
        }
    }
}