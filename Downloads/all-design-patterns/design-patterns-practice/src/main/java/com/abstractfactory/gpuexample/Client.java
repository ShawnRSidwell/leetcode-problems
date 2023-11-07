package com.abstractfactory.gpuexample;

public class Client {

    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        GPU msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();



        Company asus = new AsusManufacturer();
        GPU asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();

        msiGpu.assemble();
        msiMonitor.assemble();


        asusGpu.assemble();
        asusMonitor.assemble();


    }
}
