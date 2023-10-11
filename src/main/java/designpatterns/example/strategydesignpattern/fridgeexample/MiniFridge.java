package designpatterns.example.strategydesignpattern.fridgeexample;

public class MiniFridge implements Refrigerator {

    @Override
    public String freeze() {
        return "Only freeze a tiny square on top";
    }

    @Override
    public String cool() {
        return "cool whatever isn't in the freeze zone";
    }

}
