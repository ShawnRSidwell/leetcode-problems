package com.factory.carexample;

public class SedanFactory extends CarFactory{

    @Override
    public Car createCar() {
        return new Sedan().assemble();
    }
}
