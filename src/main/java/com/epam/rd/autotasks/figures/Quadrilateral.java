package com.epam.rd.autotasks.figures;

import static java.lang.Math.abs;

class Quadrilateral extends Figure {
    Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {

        return getTriangleArea(a,b,c) + getTriangleArea(c,d,a);
    }

    private double getTriangleArea(Point a, Point b, Point c) {
        return abs((a.getX() - c.getX()) * (b.getY() - a.getY()) -
                (a.getX() - b.getX()) * (c.getY() - a.getY())) / 2;
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")" + "(" + b.getX() + "," + b.getY() + ")" + "(" + c.getX() + "," + c.getY() + ")" + "(" + d.getX() + "," + d.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        double min = Double.MAX_VALUE;
        Point[] points = new Point[]{a, b, c, d};
        for (Point point : points) {
            if (point.getX() < min) {
                min = point.getX();
            }
        }

        return new Point(min, min);
    }

}
