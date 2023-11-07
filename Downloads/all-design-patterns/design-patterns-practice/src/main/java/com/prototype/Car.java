package com.prototype;

public class Car extends Vehicle{

    private int topSpeed;
    private GpsSystem gpsSystem;

    public Car(){};

    //Deep Copy
    public Car(Car car){
        super(car);
        this.topSpeed = car.topSpeed;
        this.gpsSystem = new GpsSystem();

    }

    @Override
    public String toString() {
        return super.toString() + " Car{" +
                "topSpeed=" + topSpeed + ", GpsId=" + gpsSystem.getId() +
                '}';
    }

    @Override
    public Car clone() {
        return new Car(this);
    }



    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setGpsSystem(GpsSystem gpsSystem) {
        this.gpsSystem = gpsSystem;
    }
}
