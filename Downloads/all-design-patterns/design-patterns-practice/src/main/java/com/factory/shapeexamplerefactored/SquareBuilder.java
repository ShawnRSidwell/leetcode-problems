package com.factory.shapeexamplerefactored;

import com.factory.shapeexamplerefactored.ShapeFactory;

public class SquareBuilder extends ShapeFactory {

    @Override
    public Shape buildShape() {
        return new Square();
    }
}
