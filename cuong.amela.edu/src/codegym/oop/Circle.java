package codegym.oop;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public String getColor() { return this.color; }

    public void setColor(String color) {
        this.color = color;
    }
}
