package com.factory.restarauntexample;

public class VeggieBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("**************************************************");
        System.out.println("Creating a sick veggie burger");
        System.out.println("**************************************************");
    }
}
