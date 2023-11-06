package com.factory.restarauntexample;

public class VeggieBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
