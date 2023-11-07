package com.builder;

public class Car {

    private String color;
    private int wheels;
    private int doors;

    private Car(String color, int wheels, int doors){
        this.color = color;
        this.wheels = wheels;
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public static CarBuilder getBuilder(){
        return new CarBuilder();
    }



    public static class CarBuilder{
        private String color;
        private int wheels;
        private int doors;
        private Car car;

        public CarBuilder withColor(String color){
            this.color = color;
            return this;
        }

        public CarBuilder withWheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public CarBuilder withDoors(int doors){
            this.doors = doors;
            return this;
        }

        public Car build(){
            this.car = new Car(color, wheels, doors);
            return this.car;
        }

        public Car getCar(){
            return this.car;
        }






    }
}
