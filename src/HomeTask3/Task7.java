package HomeTask3;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5];

        for(int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(100);
            if (i==0) {
            }
        }

        System.out.println("Generated array: " +Arrays.toString(array));

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array.length - 1 -i; j++)
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }

        System.out.println("Sorted array: "+Arrays.toString(array));
    }
}
