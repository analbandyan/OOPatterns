package com.patterns.singleton.impl;

import static java.lang.System.out;

public class SingletonOnDemandHolderIdiom {

    private static class SingletonHolder {
        private static SingletonOnDemandHolderIdiom instance = new SingletonOnDemandHolderIdiom();
    }

    private SingletonOnDemandHolderIdiom() {
        out.println("inside MyClassIdiom constructor");
    }

    public static SingletonOnDemandHolderIdiom getInstance() {
        out.println("inside MyClassIdiom.getInstance");
        return SingletonHolder.instance;
    }

    public static void otherMethod() {
        out.println("inside MyClassIdiom.otherMethod");
    }


}
