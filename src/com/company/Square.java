package com.company;

public class Square extends Shape{
    public Square() {
    }

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2*getLength()+2*getWidth();
    }
}
