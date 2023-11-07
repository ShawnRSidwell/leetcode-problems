package com.prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;

    protected Vehicle(){}

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void clone(List<Vehicle> vehicles){
        List<Vehicle> copyList = new ArrayList<>();
        for(Vehicle vehicle: vehicles){
            copyList.add(vehicle.clone());
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Vehicle clone();
}
