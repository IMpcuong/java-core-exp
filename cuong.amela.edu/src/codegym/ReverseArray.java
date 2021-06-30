package codegym;

import java.util.Scanner;

public class ReverseArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array) {
        System.out.printf("%-20s%s", "Elements in this array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            reverseArray[j-1] = array[i];
            j--;
        }
        return reverseArray;
    }

    public static void main(String[] args) {
        int size;
        int[] array;
        do {
            System.out.println("Input size: ");
            size = scanner.nextInt();
            if (size > 20) System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];

        inputArray(array);
        printArray(array);
        int[] newArray;
        newArray = reverseArray(array);
        System.out.println();
        System.out.println("Element of reverse array!");
        printArray(newArray);
    }
}
