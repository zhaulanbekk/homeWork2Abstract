package com.company;

public class Circle extends Shape{
    private int radius;
  private final double pi=Math.PI;

    public Circle() {

    }

    public Circle(int length, int width, int radius) {
        super(length, width);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*pi*radius;
    }
}
