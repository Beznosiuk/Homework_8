package com.groupqa1;

public abstract class Shape implements Draw{
    private String color;

    Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println(this + " -> area = " + this.CalcArea());
    }

    public  String toString() {
        return "Class = " + getClass().getName() + "\n" + "Color = " + getColor();
    }

    public abstract double CalcArea();

}
