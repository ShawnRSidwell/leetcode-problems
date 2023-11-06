package com.factory.carexample;

public class SUV implements  Car{
    String size;
    int seats;
    int doors;


    @Override
    public Car assemble() {
        return new SUV().specifications();
    }

    @Override
    public Car specifications() {
        setSize("Large");
        setDoors(6);
        setSeats(8);
        return this;
    }

    @Override
    public void go() {
        System.out.println("RAWWWRRR");
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
        return "SUV{" +
                "size='" + size + '\'' +
                ", seats=" + seats +
                ", doors=" + doors +
                '}';
    }
}
