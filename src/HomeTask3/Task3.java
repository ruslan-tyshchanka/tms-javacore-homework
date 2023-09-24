package HomeTask3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 5;

        int[] firstArray = new int[arraySize];
        int[] secondArray = new int[arraySize];


        for (int i = 1; i <= 2; i++) {
            int[] array = new int[arraySize];
            for (int valueIndex = 0; valueIndex < array.length; valueIndex++) {
                array[valueIndex] = random.nextInt(10);
            }
            if (i == 1) {
                System.arraycopy(array, 0, firstArray, 0, arraySize);
            }
            if (i == 2) {
                System.arraycopy(array, 0, secondArray, 0, arraySize);
            }
        }

        System.out.println("First array: "+ Arrays.toString(firstArray));
        System.out.println("Second array: "+ Arrays.toString(secondArray));

        double sumOfFirstArray = firstArray[0];
        double sumOfSecondArray = secondArray[0];

        for (int i = 1; i < arraySize; i++) {
            sumOfFirstArray = sumOfFirstArray+firstArray[i];
        }

        for (int i = 1; i < arraySize; i++) {
            sumOfSecondArray = sumOfSecondArray+secondArray[i];
        }

        double averageForFirstArray = sumOfFirstArray/arraySize;
        double averageForSecondArray = sumOfSecondArray/arraySize;

        System.out.println("Average value for first array: "+averageForFirstArray);
        System.out.println("Average value for second array: "+averageForSecondArray);

        if (averageForFirstArray>averageForSecondArray) {
            System.out.println("First array is bigger than second array");
        } if (averageForFirstArray<averageForSecondArray) {
            System.out.println("Second array is bigger than first array");
        } else {
            System.out.println("An average of both arrays is identical");
        }
    }
}
