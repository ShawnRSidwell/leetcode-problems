package com.abstractfactory.gpuexample;

public class MsiGpu implements GPU{

    @Override
    public void assemble() {
        System.out.println("Assembling MSI gpu");
    }
}
