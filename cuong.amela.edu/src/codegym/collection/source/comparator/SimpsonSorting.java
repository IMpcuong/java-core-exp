package codegym.collection.source.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpsonSorting {

    public static void main(String... sortingWithList) {
        List<SimpsonCharacter> simpsons = new ArrayList<>();
        simpsons.add(new SimpsonCharacter("Homer"));
        simpsons.add(new SimpsonCharacter("Marge"));
        simpsons.add(new SimpsonCharacter("Bart"));
        simpsons.add(new SimpsonCharacter("Lisa"));

        Collections.sort(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::print);

        System.out.println();

        Collections.reverse(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::print);
    }
}
