package com.abstractfactory.GuiExample;

public class Client {

    private GuiFactory factory;

    public Client(GuiFactory factory) {
        this.factory = factory;
    }

    public void renderUI(){
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.render();
        checkbox.render();

    }

    public static void main(String[] args) {

        Client windowsClient = new Client(new WindowsFactory());
        windowsClient.renderUI();


        Client macClient = new Client(new MacFactory());
        macClient.renderUI();

    }


}
