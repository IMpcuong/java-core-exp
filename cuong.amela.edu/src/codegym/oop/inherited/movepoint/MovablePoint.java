package codegym.oop.inherited.movepoint;

public class MovablePoint extends Point {
    private double xSpeed = 1.0;
    private double ySpeed = 1.0;

    public MovablePoint() {
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed() {
        return new double[] {this.xSpeed, this.ySpeed};
    }

    public MovablePoint move() {
        double start_point = getX();
        double end_point = getY();
        start_point += this.xSpeed;
        end_point += this.ySpeed;
        setX(start_point);
        setY(end_point);
        return this;
    }

    @Override
    public String toString() {
        double[] speed = getSpeed();
        return "[x,y] = " + getX() + " " + getY() + " "
                + "[xSpeed,ySpeed] = " + speed[0] + " " + speed[1];
    }
}
