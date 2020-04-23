package com.patterns.pattern.singleton.impl;

import static java.lang.System.out;

public class SingletonOnDemandHolderIdiom {

    private static class SingletonHolder {
        private static final SingletonOnDemandHolderIdiom instance = new SingletonOnDemandHolderIdiom();
    }

    private SingletonOnDemandHolderIdiom() {
        out.println("inside SingletonOnDemandHolderIdiom constructor");
    }

    public static SingletonOnDemandHolderIdiom getInstance() {
        out.println("inside SingletonOnDemandHolderIdiom.getInstance");
        return SingletonHolder.instance;
    }

    public static void otherMethod() {
        out.println("inside SingletonOnDemandHolderIdiom.otherMethod");
    }


}
