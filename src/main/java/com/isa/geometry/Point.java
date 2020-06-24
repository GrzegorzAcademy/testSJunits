package com.isa.geometry;

public class Point {

    private Double x;
    private Double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double distance(Point point) {
        return Math.sqrt(Math.pow(getX() - point.getX(), 2) + Math.pow(getY() - point.getY(), 2));
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
}
