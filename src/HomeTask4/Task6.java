package HomeTask4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] array = new int[3][3];

        System.out.println("Generated array is displayed below:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++)
                for(int k = 0; k < array[i].length-1-j; k++)
                    if(array[i][k] > array[i][k+1]) {
                        int tmp = array[i][k];
                        array[i][k] = array[i][k+1];
                        array[i][k+1]=tmp;
                    }
        }

        System.out.println("Sorted array is below:");

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
