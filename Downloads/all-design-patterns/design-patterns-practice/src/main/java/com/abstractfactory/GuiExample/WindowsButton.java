package com.abstractfactory.GuiExample;

public class WindowsButton implements Button{

    @Override
    public void render() {
        System.out.println("rendering a windows Button");
    }
}
