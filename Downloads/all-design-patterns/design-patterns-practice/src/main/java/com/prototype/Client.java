package com.prototype;

public class Client {

    public static void main(String[] args) {

        VehicleCache vehicleCache = new VehicleCache();
        Vehicle car = vehicleCache.get("Bugatti Chiron");
        System.out.println(car.toString());



    }
}
