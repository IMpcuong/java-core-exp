package codegym.abstraction;

public class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void howToColor() {
        System.out.println("You have to color 4 sides of square ");
    }

    @Override
    public int compareTo(Shape square) {
        return this.getSide() >= ((Square) square).getSide() ? 1 : -1;
    }

    @Override
    public int compare(Shape square1, Shape square2) {
        int isBigger = ((Square) square1).getSide() >= ((Square) square2).getSide() ? 1 : -1;
        return isBigger;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
