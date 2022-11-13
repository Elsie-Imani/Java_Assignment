package Question2;

//importing Scanner
import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);

        // my variables
        double java_Marks, networking_Marks, math_Marks, average; 

        // input java marks
        System.out.println("Enter marks for Java Programming: ");
        java_Marks = input.nextInt(); 
        // input networking marks
        System.out.println("Enter marks for Networking: ");
        networking_Marks = input.nextInt(); 
        // input maths marks
        System.out.println("Enter marks for Maths: ");
        math_Marks = input.nextInt(); 

        // output
        System.out.println("\nMarks for Java Programming is: " + java_Marks);
        System.out.println("Marks for Networking: " + networking_Marks);
        System.out.println("Marks for Maths: " + math_Marks);

        // calculate the average
        average = (java_Marks + networking_Marks + math_Marks) / 3;

        // output the average
        System.out.println("\nThe average is: " + average);
    }

}
