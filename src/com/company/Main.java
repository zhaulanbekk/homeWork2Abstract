package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Triangle triangle=new Triangle(3,4,5);
        System.out.println("Perimeter of triangle :"+triangle.getPerimeter());

        Circle circle=new Circle(3,4,5);
        System.out.println("Perimeter of circle :"+circle.getPerimeter());

        Rectangle rectangle=new Rectangle(3,4);
        System.out.println("Perimeter of rectangle :"+rectangle.getPerimeter());

        Diamond diamond=new Diamond(7,8);
        System.out.println("Perimeter of diamond :"+diamond.getPerimeter());

        Square square=new Square(9,7);
        System.out.println("Perimeter of square :"+square.getPerimeter());
    }
}
