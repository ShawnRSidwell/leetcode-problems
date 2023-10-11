package designpatterns.example.strategydesignpattern.fridgeexample;

public class KitchenFridge implements Refrigerator{
    @Override
    public String freeze(){return "Freeze whole bottom box";}

    @Override
    public String cool(){return "whole bottom box";}
}
