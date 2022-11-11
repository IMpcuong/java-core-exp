package codegym;

import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeleteElementInArray {
    public static Scanner scan = new Scanner(System.in);

    public static int[] indexOfNumberInArray(int number, int[] array) {
        int size = array.length;
        int countIndex = 0;
        int[] indexArray;
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                countIndex++;
            }
        }
        indexArray = new int[countIndex];
        for (int i = 0, j = 0; i < size; i++) {
            if (array[i] == number) {
                indexArray[j++] = i;
            }
        }
        return indexArray;
    }

    public static int[] deleteElementsInArray(int index, int[] array) {
        if(array == null || index < 0 || index >= array.length) {
            System.out.println("Non-existing index");
            return array;
        }
        List<Integer> arrayList = IntStream.of(array).boxed().collect(Collectors.toList());
        arrayList.remove(index);

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] array = {2,3,4,3,5,6,3,2};
        int size = array.length;

        System.out.print("Input your number:\t");
        int number = scan.nextInt();

        System.out.print("The ordinary array:\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        int[] indexArray = indexOfNumberInArray(number, array);
        System.out.print("The index of number we want to remove inside the array:\t");
        for (int i = 0; i < indexArray.length; i++) {
            System.out.print(indexArray[i] + "\t");
        }
        System.out.println();

        // array = deleteElementsInArray(indexArray[0], array);
        // array = deleteElementsInArray(indexArray[1], array);
        // array = deleteElementsInArray(indexArray[2], array);

        for (int i = 0, j = 0; i < size; i++) {
            if (array[i] == number) {
                array = deleteElementsInArray(i, array);
                size--;
            }
        }

        System.out.print("The new array:\t");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
