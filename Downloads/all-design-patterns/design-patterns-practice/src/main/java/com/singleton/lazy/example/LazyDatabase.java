package com.singleton.lazy.example;

public class LazyDatabase {

    private volatile static LazyDatabase INSTANCE;


    private LazyDatabase(){
        //put all the database connection code here
    }

    private static LazyDatabase getInstance(){

        //Make sure to check if instance is before and after synchronization.
        if(INSTANCE == null){
            synchronized (LazyDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyDatabase();
                }
            }
        }
        return INSTANCE;
    }

}
