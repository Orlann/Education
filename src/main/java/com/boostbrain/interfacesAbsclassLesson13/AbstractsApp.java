package com.boostbrain.interfacesAbsclassLesson13;

import java.util.ArrayList;

public class AbstractsApp {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();       // for Interface example
        Shape shape = new Circle("Red", 2);
        shapes.add(shape);
        shapes.add(new Rectangle(2,3,"Green"));
        printCircleAndRectangle(shapes);

        ArrayList<AbstractShape> abstractShapes = new ArrayList<AbstractShape>();   // for AbstractClass example
        AbstractShape square = new Square(5);
        abstractShapes.add(square);
        abstractShapes.add(new Triangle(12,4));
        printSquareAndTriangle(abstractShapes);
    }

    public static void printSquareAndTriangle(ArrayList<AbstractShape> absShapes) {
        for (AbstractShape item : absShapes) {
            System.out.println(String.format("\nName is %s", item.printName()));
            System.out.println(String.format("Size is %f", item.printSize()));
            item.printColor();
        }
    }

    public static void printCircleAndRectangle(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(String.format("\nName is %s", shape.printName()));
            System.out.println(String.format("Color is %s", shape.printColor()));
            System.out.println(String.format("Size is %f", shape.printSize()));
        }
    }
}
