package com.patterns.singleton.impl;

import static java.lang.System.out;

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        out.println("inside MyClassEager constructor");
    }

    public static SingletonEager getInstance() {
        out.println("inside MyClassEager.getInstance");
        return instance;
    }

    public static void otherMethod() {
        out.println("inside MyClassEager.otherMethod");
    }

}
