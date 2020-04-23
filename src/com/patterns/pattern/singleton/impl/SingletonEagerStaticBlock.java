package com.patterns.pattern.singleton.impl;

import static java.lang.System.out;

public class SingletonEagerStaticBlock {

    private static SingletonEagerStaticBlock instance = null;

    static {
        try {
            //preprocess
            instance = new SingletonEagerStaticBlock();
        } catch (Exception e) {
            //do exception handling
        }
    }

    private SingletonEagerStaticBlock() {
        out.println("inside SingletonEagerStaticBlock constructor");
    }

    public static SingletonEagerStaticBlock getInstance() {
        out.println("inside SingletonEagerStaticBlock.getInstance");
        return instance;
    }

    public static void otherMethod() {
        out.println("inside SingletonEagerStaticBlock.otherMethod");
    }


}
