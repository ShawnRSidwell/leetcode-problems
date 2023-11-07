package com.prototype;

public class GpsSystem {
    private static int count = 0;
    private int id;

    public GpsSystem() {
        this.id = ++count;
    }

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }
}
