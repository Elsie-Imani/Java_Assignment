import java.util.Arrays; //initiating  Arrays
import java.util.Scanner; // initiating the  Scanner

class Question1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // creating an arrays and setting the values to 0
        int[] array = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        // input data, that is a range of maybe 15 numbers
        System.out.println("\nEnter 15 numbers to our array: ");
        // store 1st position to the 15th position
        array[0] = input.nextInt();
        array[1] = input.nextInt();
        array[2] = input.nextInt();
        array[3] = input.nextInt();
        array[4] = input.nextInt();
        array[5] = input.nextInt();
        array[6] = input.nextInt();
        array[7] = input.nextInt();
        array[8] = input.nextInt();
        array[9] = input.nextInt();
        array[10] = input.nextInt();
        array[11] = input.nextInt();
        array[12] = input.nextInt();
        array[13] = input.nextInt();
        array[14] = input.nextInt();

        // converting the array to a string list.
        var myList = Arrays.toString(array);

        // display the array as a list
        System.out.println("Our array has the following values: " + myList);

        System.out.println("Enter a random number to check if it is in the array: ");
        var numInput = input.nextInt();

        check(array, numInput);

    }

    private static void check(int[] arr, int valueToCheck) {

        // implore Linear Search as a method
        boolean test = false;
        for (int num : arr) {

            // check if the specified num
            // is present in the array or not
            if (num == valueToCheck) {
                test = true;
                break;
            }

        }

        // output the result by printing
        if (test) {
            System.out.println(valueToCheck + " is in the array.");
        } else {
            System.out.println(valueToCheck + " is not in the array.");
        }

    }
}