package com.effectivejava.chapter1.item3;

public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        // do something
    }
}
