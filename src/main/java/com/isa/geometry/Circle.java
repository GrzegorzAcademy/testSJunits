package com.isa.geometry;

public class Circle {

    private Double radius;

    private static final Double PI = 3.14159265358979323846264338327950288419716939937510;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double calculateCircumference() {

        if (radius == null) {
            throw new IllegalArgumentException("Radius is mandatory!");
        }

        return 2 * PI * radius;
    }

    public Double calculateArea() {

        if (radius == null) {
            throw new IllegalArgumentException("Radius is mandatory!");
        }

        return PI * Math.pow(radius, 2);
    }
}
