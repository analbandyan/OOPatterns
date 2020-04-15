package com.patterns.singleton.impl;

import static java.lang.System.out;

public class SingletonEagerStaticBlock {

    private static SingletonEagerStaticBlock instance;

    static {
        try {
            out.println("inside MyClassStaticBlock static block");
            instance = new SingletonEagerStaticBlock();
        } catch (Exception ex) {
            //do something
        }
    }

    private SingletonEagerStaticBlock() {
        out.println("inside MyClassStaticBlock constructor");
    }

    public static SingletonEagerStaticBlock getInstance() {
        out.println("inside MyClassStaticBlock.getInstance");
        return instance;
    }

    public static void otherMethod() {
        out.println("inside MyClassStaticBlock.otherMethod");
    }

}
