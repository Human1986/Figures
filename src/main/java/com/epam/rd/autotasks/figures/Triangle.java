package com.epam.rd.autotasks.figures;

import static java.lang.Math.abs;

class Triangle extends Figure {
    Point a , b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {

        return abs((a.getX() - c.getX()) * (b.getY() - a.getY()) - (a.getX() - b.getX()) * (c.getY() - a.getY())) / 2;
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")" + "(" + b.getX() + "," + b.getY() + ")" + "(" + c.getX() + "," + c.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        double min = Double.MAX_VALUE;
        Point[] points = new Point[]{a,b,c};
        for (Point point : points) {
            if (point.getX() < min) {
                min = point.getX();
            }
        }

        return new Point(min, min);
    }

}
