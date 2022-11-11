package codegym.collection.source.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleOfComparator {

    public static void main(String... args) {
        List<SimpsonCharacter> characters = new ArrayList<>();

        SimpsonCharacter homer = new SimpsonCharacter("Homer");
        SimpsonCharacter moe = new SimpsonCharacter("Moe");

        characters.add(homer);
        characters.add(moe);

        // NOTE: This pattern was inspired for Rust's type-casting convention (my thought).
        // Exp: (in Rust)
        // `let num: f32 = f32::NAN.to_int_unchecked::<u8>()`
        Collections.sort(characters, (Comparator.<SimpsonCharacter>comparingInt(character1 -> character1.name.length())
                .thenComparingInt(character2 -> character2.name.length())));

        System.out.println(characters);
    }
}
