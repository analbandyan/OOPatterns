package com.patterns.singleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class SingletonRunnerUtils {

    public static <T> T callClassGetInstanceMethod(Class<T> clazz) throws InvocationTargetException, IllegalAccessException {
        return Arrays.stream(clazz.getMethods())
                .filter(m -> "getInstance".equals(m.getName()))
                .map(SingletonRunnerUtils::invokeMethod)
                .map(instance -> (T) instance)
                .findFirst()
                .orElse(null);
    }

    private static Object invokeMethod(Method m) {
        try {
            return m.invoke(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
