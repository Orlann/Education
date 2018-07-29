package com.boostbrain.interfacesAbsclassLesson13;

public class Rectangle implements Shape {
   private double width;
   private double height;
   private String color;

    public Rectangle(double width, double height, String color){
    this.width = width;
    this.height = height;
    this.color = color;
    }

    public String printColor() {
        return color;
    }

    public double printSize() {
        return width*height;
    }

    public String printName() {
        return "Rectangle";
    }
}
