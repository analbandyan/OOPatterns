package com.patterns.singleton.impl;

import static java.lang.System.out;

public enum SingletonEnum {

    INSTANCE;

    SingletonEnum() {
        out.println("inside MyCassEnum constructor");
    }

    public static void otherMethod() {
        out.println("inside MyCassEnum.otherMethod");
    }

}
