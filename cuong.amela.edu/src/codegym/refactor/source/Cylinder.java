package codegym.refactor.source;

public class Cylinder {
    public static double getVolume(double radius, double height) {
        double baseArea = getBaseArea(radius);
        return baseArea * height;
    }

    public static double getTotalArea(double radius, double height) {
        return 2 * getBaseArea(radius) + getPerimeter(radius) * height;
    }

    public static double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
