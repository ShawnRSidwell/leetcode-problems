package designpatterns.example.strategydesignpattern.fridgeexample;

public class StrategyDesignExampleMain {

    /** Strategy design pattern is used when it is not completely known what object is to be past through, but the results are often the same.
     * This is in contrast to state design pattern where the state is known, but the result is different.
     * Generics are frequently used in the strategy design pattern as they allow for objects of Type T to be passed through.
     */
    public static void main(String[] args) {
        RefrigeratorCooling refrigeratorCooling = new RefrigeratorCooling();
        refrigeratorCooling.setRefrigerator(new KitchenFridge());
        System.out.println(refrigeratorCooling.cool());
        System.out.println(refrigeratorCooling.freeze());
    }
}
