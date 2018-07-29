package com.boostbrain.interfacesAbsclassLesson13;

public class Circle implements Shape {
    private String color;
    private double radius;

    public Circle(String color, double r) {
        this.color = color;
        radius = r;
    }

    public String printColor() {
        return color;
    }

    public double printSize() {
        return 3.14 * radius * radius;
    }

    public String printName() {
        return "Circle";
    }
}
