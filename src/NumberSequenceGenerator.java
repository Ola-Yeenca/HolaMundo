package src;

import java.util.ArrayList;
import java.util.List;

public class NumberSequenceGenerator {
    public static void main(String[] args) {
        int N = 5;

        for (int i = 1; i <= N; i++) {
            List<Integer> sequence = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                sequence.add(j);
            }
            System.out.println("N = " + i);
            System.out.println(sequence);

            if (i < N && sequence.size() > 1) {
                List<Integer> subSequence = sequence.subList(1, sequence.size() - 1);
                System.out.println(subSequence);
            }
        }
    }
}