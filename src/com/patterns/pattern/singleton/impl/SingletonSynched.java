package com.patterns.pattern.singleton.impl;

import static java.lang.System.out;

public class SingletonSynched {

    private static volatile SingletonSynched instance;

    private SingletonSynched() {
        out.println("inside MyClassSynched constructor");
    }

    public static SingletonSynched getInstance() {
        out.println("inside MyClassSynched.getInstance");
        if (instance == null) {

            synchronized (SingletonSynched.class) {
                if (instance == null) {
                    instance = new SingletonSynched();
                }
            }

        }

        return instance;
    }

    public static void otherMethod() {
        out.println("inside MyClassSynched.otherMethod");
    }

}
