package codegym.collection.source.comparator;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String... moeTavern) {
        int[] moePints = new int[] {9, 8, 7, 6, 1};

        Arrays.sort(moePints);

        Arrays.stream(moePints).forEach(System.out::print);
        System.out.println();

        SimpsonCharacter[] simpsonCharacters = new SimpsonCharacter[]{new SimpsonCharacter("Lisa"), new SimpsonCharacter("Homer")};

        Arrays.sort(simpsonCharacters);
        Arrays.stream(simpsonCharacters).map(s -> s.name).forEach(System.out::println);
    }
}
