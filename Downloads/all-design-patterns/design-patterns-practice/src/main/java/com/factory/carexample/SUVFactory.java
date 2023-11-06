package com.factory.carexample;

public class SUVFactory extends CarFactory{

    @Override
    public Car createCar() {
        return new SUV().assemble();
    }
}
