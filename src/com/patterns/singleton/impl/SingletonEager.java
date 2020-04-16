package com.patterns.singleton.impl;

import static java.lang.System.out;

public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        out.println("inside SingletonEager constructor");
    }

    public static SingletonEager getInstance() {
        out.println("inside SingletonEager.getInstance");
        return instance;
    }

    public static void otherMethod() {
        out.println("inside SingletonEager.otherMethod");
    }

}
