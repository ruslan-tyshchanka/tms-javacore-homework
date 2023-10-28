package HomeTask3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        int[] array = new int[5];

        Random random = new Random();
        System.out.println("New array is created: ");
        for(int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i]+" ");
        }

        System.out.println("New array with uneven numbers being changed to zero is created:");
        for (int i = 0; i < array.length; i++) {
            int remainder = array[i] % 2;
            if (remainder==1) {
                array[i] = 0;
                break;
            }
        System.out.print(array[i]+" ");
        }
    }
}
