package task_one;

//imports that were generated by the IDE
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question4 {


    // main method
    public static void main(String[] args) {

        // This list holds 71-149
        List<Integer> myList = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        
        // adding last item so that we could also iterate upto 150
        myList.add(150);

        // calling my methods to print the output
        multiplesOfTwo(myList);
        multiplesOfThree(myList);
        multiplesOfSeven(myList);
    }

    // This method will output a list of multiples of 2
    static void multiplesOfTwo(List<Integer> myList) {
        System.out.println("\n\n2 has the following multiples :");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                System.out.println(myList.get(i));
                
            }
            if (i == 150 - 71) {
                    break;
                }
        }
    }

    // This method will output a list of multiples of 3
    static void multiplesOfThree(List<Integer> myList) {
        System.out.println("\n\n3 has the following multiples :");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 3 == 0) {
                System.out.println(myList.get(i));

                
            }
            if (i == 150 - 71) {
                    break;
                }

        }
    }

    // This method will output a list of multiples of 7
    static void multiplesOfSeven(List<Integer> myList) {
        System.out.println("\n\n7 has the following multiples :");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 7 == 0) {
                System.out.println(myList.get(i));

               
            }
             if (i == 150 - 71) {
                    break;
                }

        }
    }
}
