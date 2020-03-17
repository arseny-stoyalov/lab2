package com.company;

/**
 * This class represents a point
 * with x and y coordinates
 * @author Arseniy Stoyalov
 */
public class Point2D {

    private double yCord;

    private double xCord;

    public Point2D(double yCord, double xCord) {
        this.yCord = yCord;
        this.xCord = xCord;
    }

    public Point2D() {
        this.xCord = 0;
        this.yCord = 0;
    }

    public double getYCord() {
        return yCord;
    }

    public void setYCord(double yCord) {
        this.yCord = yCord;
    }

    public double getXCord() {
        return xCord;
    }

    public void setXCord(double xCord) {
        this.xCord = xCord;
    }

    @Override
    public boolean equals(Object obj) {
        return this.xCord == ((Point2D) obj).xCord
                && this.yCord == ((Point2D) obj).yCord;
    }

}
