package com.patterns.singleton.impl;

import static java.lang.System.out;

public class SingletonClassic {

    private static SingletonClassic instance;

    private SingletonClassic() {
        out.println("inside MyClass constructor");
    }

    public static SingletonClassic getInstance() {
        out.println("inside MyClass.getInstance");

        if(instance == null) {
            instance = new SingletonClassic();
        }
        return instance;
    }

    public static void otherMethod() {
        out.println("inside MyClass.otherMethod");
    }

}
