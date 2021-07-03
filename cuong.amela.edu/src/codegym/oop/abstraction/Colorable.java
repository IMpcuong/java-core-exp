package codegym.abstraction;

import java.util.Comparator;

public interface Colorable extends Comparator<Shape> {
    public void howToColor();
    public int compareTo(Shape shape);
}
