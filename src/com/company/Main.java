package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Point3D> points = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String[] strPoints = in.nextLine().split("\\s+");
            points.add(
                    new Point3D(Integer.parseInt(strPoints[0])
                            , Integer.parseInt(strPoints[1])
                            , Integer.parseInt(strPoints[2])));
        }

        System.out.println(computeArea(points.get(0), points.get(1), points.get(2)));
    }

    /**
     * Calculates area of a given triangle
     * @param p1 first point of the triangle
     * @param p2 second point of the triangle
     * @param p3 third point of the triangle
     * @return double value representing area
     */
    public static double computeArea(Point3D p1, Point3D p2, Point3D p3) {

        double a = p1.distanceTo(p2);
        double b = p2.distanceTo(p3);
        double c = p3.distanceTo(p1);

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
