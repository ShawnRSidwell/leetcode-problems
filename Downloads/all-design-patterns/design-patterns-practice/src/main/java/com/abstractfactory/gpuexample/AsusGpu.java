package com.abstractfactory.gpuexample;

public class AsusGpu implements GPU{

    @Override
    public void assemble() {
        System.out.println("Assembling Asus GPU");
    }
}
