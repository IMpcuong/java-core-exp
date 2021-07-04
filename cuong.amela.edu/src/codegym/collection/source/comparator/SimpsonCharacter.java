package codegym.collection.source.comparator;

public class SimpsonCharacter implements Comparable<SimpsonCharacter>{

    public String name;

    SimpsonCharacter(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(SimpsonCharacter simpsonCharacter) {
        return this.name.compareTo(simpsonCharacter.name);
    }
}
