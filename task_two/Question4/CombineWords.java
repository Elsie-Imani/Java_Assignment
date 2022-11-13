package Question4;

public class CombineWords {

    // This is a static method
    static String getSecondSentence() {
        return " your favorite color?";
    }


    // main method
    public static void main(String[] args) {

        String set1, set2;

        // calling a static method
        set1 = "What is";
        set2 = getSecondSentence();

        // using non-static method
        CombineWords objOfThisClass = new CombineWords();
        objOfThisClass.addWords(set1, set2);
    }

        // non static method
        void addWords(String set1, String set2) {
            //returns void
            System.out.println(set1 + set2);
        }

}