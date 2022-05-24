package com.anurag;

public abstract class Shape {
    String color;

    public Shape() {
        this.color = "BLUE";
        System.out.println("In Shape Constructor");
    }

    public abstract int area();
}
