package HomeTask4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[][][] array = {{{1, 2, 3}, {2, 3, 4}}, {{4, 5, 6, 9}, {1}, {2, 3}}};

        System.out.println("Created arrays are below: ");
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter increment for all array elements:");
        int increment = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = array[i][j][k] + increment;
                    System.out.print(array[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
