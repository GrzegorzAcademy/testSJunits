package com.isa.geometry.operator;

public class BasicIntOperator {

    private int x;
    private int y;

    public BasicIntOperator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        return x + y;
    }

    public int difference() {
        return x - y;
    }

    public int product() {
        return x * y;
    }

    public double quotient() {
        return x / y;
    }
}
