package com.company;

public class Rectangle extends Shape{
    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2*getLength()+2*getWidth();
    }
}
