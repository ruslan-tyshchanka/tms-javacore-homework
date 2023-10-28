package HomeTask4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 5;

        int[][] array = new int[arraySize][arraySize];

        System.out.println("Generated array is displayed below:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Main matrix diagonal elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i]+" ");
        }

        System.out.println();

        System.out.print("Secondary matrix diagonal elements: ");
        for (int i = 0; i < array.length; i++) {
            arraySize--;
            System.out.print(array[i][arraySize]+" ");
        }
    }
}
