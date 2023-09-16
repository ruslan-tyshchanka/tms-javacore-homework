package HomeTask3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5];

        for(int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(100);
            if (i==0) {
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from the following array: "+array[0]+", "+array[1]+", "+array[2]+", "+array[3]+", "+array[4]);
        int inputNumber = sc.nextInt();

        boolean isNumberCorrect = false;

        for (int i = 0; i< array.length; i++) {
            if (inputNumber == array[i]) {
                isNumberCorrect=true;
            }
        }

        if (isNumberCorrect==true) {
            System.out.println("Congratulations! You entered correct number!");
        } else {
            System.out.println("Incorrect number was entered :(");
        }
    }
}
