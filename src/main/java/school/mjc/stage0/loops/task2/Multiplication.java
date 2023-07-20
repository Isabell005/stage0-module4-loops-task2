package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int N=0 ;
        int i = 1;
        while (i <= multiplyByAndToInclusive) {
            System.out.println(N +  i + N * i);
            i++;
        }
    }
}
