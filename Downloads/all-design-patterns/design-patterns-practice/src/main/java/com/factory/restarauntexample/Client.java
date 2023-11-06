package com.factory.restarauntexample;

public class Client {
    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        beefRestaurant.orderBurger();

        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        veggieRestaurant.createBurger();
    }
}
