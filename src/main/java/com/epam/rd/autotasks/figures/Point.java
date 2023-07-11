package com.epam.rd.autotasks.figures;

class Point {
    private final double x;
    private final double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

//    public static double getDistance(Point p1, Point p2) {
//        return Math.sqrt(StrictMath.pow(p2.getX() - p1.getX(), 2)
//                + Math.pow(p2.getY() - p1.getY(), 2));
//    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
