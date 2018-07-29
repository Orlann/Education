package com.boostbrain.interfacesAbsclassLesson13;

public class Square extends AbstractShape {
double side;

public Square(double side){
    super("Red");
    this.side = side;
}

    public String printName() {
        return "Square";
    }

    public double printSize() {
        return side*side;
    }
}
