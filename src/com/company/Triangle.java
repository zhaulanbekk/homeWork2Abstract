package com.company;

public class Triangle extends Shape{
    private int height;
    public Triangle() {
    }

    public Triangle(int length, int width,int height) {
        super(length, width);
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return getWidth()*getLength()*height;
    }
}
