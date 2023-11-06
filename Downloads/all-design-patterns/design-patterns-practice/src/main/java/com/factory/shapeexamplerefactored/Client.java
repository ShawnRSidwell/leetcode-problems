package com.factory.shapeexamplerefactored;

public class Client {

    public static void main(String[] args) {
    ShapeFactory circle = new CircleBuilder();
    circle.drawShape();

    ShapeFactory square = new SquareBuilder();
    square.drawShape();

    ShapeFactory rectangle = new RectangleBuilder();
    rectangle.drawShape();


    }


}
