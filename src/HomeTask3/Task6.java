package HomeTask3;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {

        String[] novelists = new String[] {"Marrs", "King", "Hammesfahr", "Silvera", "Isaac"};

        System.out.println("Initial novelists: "+ Arrays.toString(novelists));

        novelists = Stream.of(novelists)
                .sorted()
                .toArray(String[]::new);

        System.out.println("Sorted novelists: "+ Arrays.toString(novelists));
    }
}
