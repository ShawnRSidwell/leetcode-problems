package com.factory.shapeexamplerefactored;



public class RectangleBuilder extends ShapeFactory{

    @Override
    public Shape buildShape() {
        return new Rectangle();
    }
}
