package school.mjc.stage0.loops.task2;

public class Multiplication {

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.printMultiplied(5); // Prints multiplication row up to 5
    }

    public void printMultiplied(int multiplyByAndToInclusive) {
        int number = (multiplyByAndToInclusive < 0) ? multiplyByAndToInclusive : 0;
        while (number <= multiplyByAndToInclusive) {
            System.out.println(multiplyByAndToInclusive * number);
            number++;
        }
    }
}