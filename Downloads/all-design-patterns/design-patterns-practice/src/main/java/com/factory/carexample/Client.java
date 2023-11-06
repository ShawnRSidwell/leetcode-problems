package com.factory.carexample;

public class Client {

    public static void main(String[] args) {
        Car SUV = new SUVFactory().createCar();
        System.out.println(SUV);
        SUV.go();


        Car Sedan = new SedanFactory().createCar();
        System.out.println(Sedan);
        Sedan.go();


    }
}
