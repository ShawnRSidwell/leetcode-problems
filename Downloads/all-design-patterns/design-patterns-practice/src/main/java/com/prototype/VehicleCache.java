package com.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {

    Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache(){
        Car car =  new Car();
        car.setBrand("Bugatti");
        car.setGpsSystem(new GpsSystem());
        car.setColor("Blue");
        car.setTopSpeed(261);
        car.setModel("Chiron");


        Bus bus = new Bus();
        bus.setBrand("Mercedes");
        bus.setColor("White");
        bus.setModel("Setra");
        bus.setSeats(48);

        cache.put("Bugatti Chiron", car);
        cache.put("Mercedes Setra", bus);
    }

    public Vehicle get(String key){
        return cache.get(key).clone();
    }


}
