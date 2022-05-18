package com.company;

public class Diamond extends Shape{
    public Diamond() {
    }

    public Diamond(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2*getLength()+2*getWidth();
    }
}
