package com.company;

public abstract class Shape {
    private int length;
    private int width;

    public Shape() {
    }

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
