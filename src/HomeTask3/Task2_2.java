package HomeTask3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements to be included in array");
        int arraySize = sc.nextInt();

        double[] array = new double[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        System.out.println("Created array: "+ Arrays.toString(array));

        double minValue = array[0];

        double maxValue = array[0];

        double averageValue = array[0];

        double arraySum = array[0];

        if (arraySize>0) {
            for (int i = 1; i < arraySize; i++) {
                if (array[i]>maxValue) {
                    maxValue=array[i];
                }
                if (array[i]<minValue) {
                    minValue=array[i];
                }
                arraySum = arraySum+array[i];
            }
        }
        averageValue=arraySum/arraySize;

        System.out.println("Max array value - "+maxValue);
        System.out.println("Min array value - "+minValue);
        System.out.println("Average array value - "+averageValue);

    }
}
