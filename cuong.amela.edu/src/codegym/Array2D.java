package codegym;

import java.util.Scanner;

public class Array2D {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int size1, size2;
        do {
            System.out.print("Size of array you want ?\n");
            System.out.print("Input your first dimension size: ");
            size1 = scan.nextInt();
            System.out.println();
            System.out.print("Input your second dimension size: ");
            size2 = scan.nextInt();
        } while (size1 < 0 || size2 < 0);

        int[][] newArray = new int[size1][size2];
        newArray = input2DArray(newArray);

        int max = findMaxElement2D(newArray);
        System.out.print("Max value of this array: " + max);
    }

    public static int[][] input2DArray(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print("Enter element " + "array[" + (i + 1) + "]" + "[" + (j + 1) + "]" + ": ");
                array2D[i][j] = scan.nextInt();
            }
        }
        return array2D;
    }

    public static int findMaxElement2D(int[][] array2D) {
        int maxValue = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j  = 0; j < array2D[i].length; j++) {
                if (maxValue < array2D[i][j]) {
                    maxValue = array2D[i][j];
                }
            }
        }
        return maxValue;
    }
}
