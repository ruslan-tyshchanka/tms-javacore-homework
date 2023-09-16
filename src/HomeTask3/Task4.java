package HomeTask3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int arraySize = 0;

        while (arraySize < 5 || arraySize > 11) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a desired array size, it should be more than 5 and less than/equal to 10:");
            arraySize = sc.nextInt();

            if (arraySize < 5 || arraySize > 10) {
                System.out.println("You've entered invalid array size.");
            }
        }

        System.out.println("An array with "+arraySize+" elements is created: ");

        int[] array = new int[arraySize];

        Random random = new Random();
        for(int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(100);
            if (i==0) {
            }
            System.out.print(array[i]+" ");
        }

        int numberOfEvenElements = 0;
        int[] placeholderForNewArray = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            int remainder = array[i] % 2;
            switch (remainder) {
                case 0:
                    placeholderForNewArray[numberOfEvenElements] = array[i];
                    numberOfEvenElements++;
                    break;
                default:
                    break;
            }
        }

        int[] evenArray = new int[numberOfEvenElements];

        for (int i = 0; i < numberOfEvenElements; i++) {
            evenArray[i] = placeholderForNewArray[i];
        }

        System.out.print("Second array with even numbers from first array was created: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i]+" ");
        }

    }
}
