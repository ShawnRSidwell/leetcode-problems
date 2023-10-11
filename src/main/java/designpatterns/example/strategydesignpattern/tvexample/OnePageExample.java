package designpatterns.example.strategydesignpattern.tvexample;

// Strategy Interface
interface TVControl {
    void turnOn();
    void turnOff();
}

// Concrete Strategies
class SonyTVControl implements TVControl {
    @Override
    public void turnOn() {
        System.out.println("Sony TV is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV is turning off.");
    }
}

class SamsungTVControl implements TVControl {
    @Override
    public void turnOn() {
        System.out.println("Samsung TV is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV is turning off.");
    }
}

// Context
class TelevisionApp {
    private TVControl tvControl;

    public void setTVControl(TVControl tvControl) {
        this.tvControl = tvControl;
    }

    public void turnOnTV() {
        tvControl.turnOn();
    }

    public void turnOffTV() {
        tvControl.turnOff();
    }
}

public class OnePageExample {
    public static void main(String[] args) {
        TelevisionApp app = new TelevisionApp();

        app.setTVControl(new SonyTVControl());
        app.turnOnTV();
        app.turnOffTV();

        app.setTVControl(new SamsungTVControl());
        app.turnOnTV();
        app.turnOffTV();
    }
}
