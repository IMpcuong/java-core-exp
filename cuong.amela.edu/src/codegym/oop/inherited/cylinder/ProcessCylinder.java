package codegym.oop.inherited.cylinder;

public class ProcessCylinder {

    public static void main(String[] args) {
        Cylinder c = new Cylinder(3, "Black", 5);
        System.out.println(c.getArea());
        System.out.println(c.getVolumn());
    }
}
