package com.boostbrain.interfacesAbsclassLesson13;

public class Triangle extends AbstractShape {
    double height;
    double side;

    public Triangle(double height, double side){
        super("Yellow");
        this.height = height;
        this.side = side;
    }

    public double printSize(){
        return 0.5*height*side;
    }

    public String printName(){
        return "Triangel";
    }
}
