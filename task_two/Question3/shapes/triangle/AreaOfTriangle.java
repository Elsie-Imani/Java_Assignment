package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class AreaOfTriangle {

    // these variables are available for this scope
    static double triangle_Base, triangle_Height, area;

    // input the triangle_Base and the triangle_Height
    void doInputs() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the base of the triangle: ");
        triangle_Base = input.nextDouble(); // store the input in triangle_Base
        System.out.println("Enter the height of the triangle: ");
        triangle_Height = input.nextDouble(); // store the input in triangle_Height
    }

    // get the area of the rectangle
    void getArea() {

        // area of triangle = 1/2 * base * height
        area = 1 / 2 * triangle_Base * triangle_Height;
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static methods in the main method
        AreaOfTriangle thisClassObj = new AreaOfTriangle();
        thisClassObj.doInputs();
        thisClassObj.getArea();
        thisClassObj.outputResults();
    }

    // method to output area
    void outputResults() {
        System.out.println("The area is: " + area);
    }

}
