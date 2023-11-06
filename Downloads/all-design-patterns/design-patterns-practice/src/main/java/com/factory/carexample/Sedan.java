package com.factory.carexample;

public class Sedan implements  Car{
    String size;
    int seats;
    int doors;


    @Override
    public Car assemble() {
        return new Sedan().specifications();
    }

    @Override
    public Car specifications() {
        setSize("Medium");
        setDoors(4);
        setSeats(5);
        return this;
    }

    @Override
    public void go() {
        System.out.println("WAAAANG DAAAAAANG");
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


    @Override
    public String toString() {
        return "Sedan{" +
                "size='" + size + '\'' +
                ", seats=" + seats +
                ", doors=" + doors +
                '}';
    }
}
