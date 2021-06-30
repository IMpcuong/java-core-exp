package codegym;

import java.util.Scanner;

public class ConcatArray {
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

    public static int[] concatArray(int[]... arrays) {
        //int size1 = array1.length, size2 = array2.length;
        /*
        int[] mergeArray = new int[size1 + size2];
        for (int i = 0; i < size1; ++i) {
        mergeArray[i] = array1[i];
        for (int j = size1 + 1; j < mergeArray.length; ++j) {
        mergeArray[j] = array2[j];
        }
        }
        */
        int length = 0;
        for (int[] array : arrays) {
            length += array.length;
        }

        int[] mergedArray = new int[length];
        int pos = 0;
        for (int[] array : arrays) {
            for (int element : array) {
                mergedArray[pos++] = element;
            }
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = new int[4];
        int[] array2 = new int[5];

        System.out.println("Input your first array!");
        inputArray(array1);
        System.out.println("Input your second array!");
        inputArray(array2);

        int[] mergedArray = concatArray(array1, array2);
        System.out.print("Your merged array:\t");
        printArray(mergedArray);
    }
}
