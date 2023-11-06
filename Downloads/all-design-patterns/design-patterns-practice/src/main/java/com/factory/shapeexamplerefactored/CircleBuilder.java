package com.factory.shapeexamplerefactored;

import com.factory.shapeexamplerefactored.ShapeFactory;

public class CircleBuilder extends ShapeFactory {

    @Override
    public Shape buildShape() {
        return new Circle();
    }
}
