package HomeTask3;

import java.util.Random;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 5;

        int[] array = new int[arraySize];

        for(int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(100);
            if (i==0) {
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be removed from an array: "+array[0]+", "+array[1]+", "+array[2]+", "+array[3]+", "+array[4]);
        int inputNumber = sc.nextInt();

        boolean isIndexToBeRemovedDetected = false;

        int[] newArray = new int[arraySize--];

        int indexForUpdatedArray = -1;

        for (int i=0; i< array.length; i++) {
            if (inputNumber==array[i]) {
                isIndexToBeRemovedDetected = true;
                System.out.println("You entered a valid number - array is being updated:");
                System.out.println("...");
            } else {
                indexForUpdatedArray++;
                newArray[indexForUpdatedArray]=array[i];
            }
        }

        if (isIndexToBeRemovedDetected==true) {
            System.out.println("Array is updated accordingly: "+newArray[0]+", "+newArray[1]+", "+newArray[2]+", "+newArray[3]);
        } else {
            System.out.println("Entered number is not included in array.");
        }
    }
}
