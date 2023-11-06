package com.factory.restarauntexample;

public class BeefBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
