package com.builder;

public class Main {

    public static void main(String[] args) {
        Chair chair = new Chair().getBuilder()
                .withChairType("Office")
                .withArms(5)
                .withLegs(1)
                .build();

        System.out.println(chair);
    }

}
