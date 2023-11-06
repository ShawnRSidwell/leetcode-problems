package com.factory.carexample;

public abstract class CarFactory {
    public Car orderCar(){
        Car car = createCar();
        car.assemble();
        return car;
    }


    public abstract Car createCar();
}
