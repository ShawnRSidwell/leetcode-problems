package com.singleton.eager.example;

public class EagerDatabase {

    private EagerDatabase(){
        //would write code here how to connect to database.
    }


    private static final EagerDatabase INSTANCE = new EagerDatabase();


    //Dont need to check if database is null since it is created at app start up .
    public static EagerDatabase getInstance(){
        return INSTANCE;
    }


}
