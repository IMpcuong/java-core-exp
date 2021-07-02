package codegym.oop.inherited.movepoint;

public class ProcessMovablePoint {
    public static void main(String[] args) {
        Point firstPoint = new Point(2, 5);
        MovablePoint movablePoint = new MovablePoint(2, 5, 3, 6);
        System.out.println(firstPoint.toString());
        System.out.println(movablePoint.toString());
        movablePoint = movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
