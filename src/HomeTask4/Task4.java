package HomeTask4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] array = new int[3][3];

        System.out.println("Generated array is displayed below:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }

        System.out.println("The sum of all array elements is "+sum);

    }
}
