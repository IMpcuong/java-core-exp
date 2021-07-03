package codegym.abstraction;

import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle> {
    public CircleComparator() {
    }

    public CircleComparator(double radius) {
        super(radius);
    }

    public CircleComparator(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public int compareTo(CircleComparator circle) {
        if (this.getRadius() > circle.getRadius()) return 1;
        else if (this.getRadius() < circle.getRadius()) return -1;
        else return 0;
    }

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
