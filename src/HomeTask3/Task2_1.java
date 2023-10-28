package HomeTask3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 5;

        int[] array = new int[arraySize];

        for(int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(3);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be removed from an array: "+array[0]+", "+array[1]+", "+array[2]+", "+array[3]+", "+array[4]);
        int inputNumber = sc.nextInt();

        boolean isIndexToBeRemovedDetected = false;



        int[] newArray = new int[arraySize];

        int numberOfElementsToBeRemoved=0;

        int indexForUpdatedArray = -1;

        for (int i=0; i< array.length; i++) {
            if (inputNumber==array[i]) {
                isIndexToBeRemovedDetected = true;
                numberOfElementsToBeRemoved++;
                System.out.println("You entered a valid number - array is being updated:");
                System.out.println("...");
            } else {
                indexForUpdatedArray++;
                newArray[indexForUpdatedArray]=array[i];
            }
        }

        if (numberOfElementsToBeRemoved>0) {
            System.out.println(numberOfElementsToBeRemoved);
            int[] finalArray = new int[newArray.length-numberOfElementsToBeRemoved];
            System.arraycopy(newArray, 0, finalArray, 0, finalArray.length);
            System.out.println("Array is updated accordingly: "+ Arrays.toString(finalArray));
        } else {
            System.out.println("Entered number is not included in array.");
        }
    }
}
