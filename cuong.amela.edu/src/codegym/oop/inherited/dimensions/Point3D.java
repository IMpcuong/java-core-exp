package codegym.oop.inherited.dimensions;

public class Point3D extends Point2D {
    private double z = 1.0;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double[] getXYZ() {
        return new double[] {super.getX(),super.getY(),this.z};
    }

    @Override
    public String toString() {
        double[] xyz = getXYZ();
        return "[x,y,z] = " + xyz[0] + " " + xyz[1] + " " + xyz[2];
    }
}
