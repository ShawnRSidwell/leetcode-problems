package com.prototype;

public class Bus extends Vehicle{

    private int seats;

    public Bus(){}

    //Shallow Copy
    public Bus(Bus bus) {
        super(bus);
        this.seats = bus.seats;
    }


    @Override
    public String toString() {
        return super.toString()+ "Bus{" +
                "doors=" + seats +
                '}';
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }


    public void setSeats(int doors) {
        this.seats = doors;
    }
}
