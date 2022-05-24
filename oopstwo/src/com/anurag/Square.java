package com.anurag;

public class Square extends Shape {
    int side;

    public Square() {
        super();
        System.out.println("Inside Square Constructor");
        side = 10;
    }

    @Override
    public int area() {
        return side * side;
    }
}
