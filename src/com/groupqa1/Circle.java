package com.groupqa1;

class Circle extends Shape {
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Class = " + getClass().getName() +
                "\n" + "Color = " + getColor() +
                "\n" + "Radius = " + radius;
    }

    @Override
    public double CalcArea() {
        return Math.PI * (radius * radius);
    }
}
