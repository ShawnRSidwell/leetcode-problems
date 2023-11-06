package com.factory.shapeexamplerefactored;

public abstract class ShapeFactory {
    public Shape drawShape(){
        Shape shape = buildShape();
        shape.draw();
        return shape;
    }

    public abstract  Shape buildShape();
}
