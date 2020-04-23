package com.patterns.pattern.singleton.impl;

import java.util.ArrayList;
import java.util.List;

public class Nton {

    private static final int NUM_OF_INSTANCES = 7;
    private static final List<Nton> instances = new ArrayList<>();
    private static int instanceRequestCount = 0;
    private int instanceNum;

    private Nton() {
    }

    public static synchronized Nton getInstance() {
        Nton instance;

        if (instances.size() == NUM_OF_INSTANCES) {
            int returnInstNumber = instanceRequestCount % NUM_OF_INSTANCES;
            instance = instances.get(returnInstNumber);
        } else {
            instance = new Nton();
            instance.instanceNum = instances.size() + 1;
            instances.add(instance);
        }

        instanceRequestCount++;

        return instance;
    }

    public int getInstanceNum() {
        return instanceNum;
    }

}
