package com.company;

/**
 * This class represents a point
 * with x, y and z coordinates
 * @author Arseniy Stoyalov
 */
public class Point3D extends Point2D {

    private double zCord;

    public Point3D(double yCord, double xCord, double zCord) {
        super(yCord, xCord);
        this.zCord = zCord;
    }

    /**
     * Counts distance from one point
     * to another
     * @param point point to count
     *              distance to
     * @return double value of distance
     */
    public double distanceTo(Point3D point) {

        double ans = Math.sqrt(
                Math.pow(this.getXCord() - point.getXCord(), 2)
                        + Math.pow(this.getYCord() - point.getYCord(), 2)
                        + Math.pow(this.getZCord() - point.getZCord(), 2));
        return ((double) Math.round(ans * 100)) / 100;
    }

    public Point3D() {
        this.zCord = 0;
    }

    public double getZCord() {
        return zCord;
    }

    public void setZCord(double zCord) {
        this.zCord = zCord;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj)
                && this.zCord == ((Point3D) obj).zCord;
    }
}
