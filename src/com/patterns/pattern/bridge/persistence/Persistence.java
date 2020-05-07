package com.patterns.pattern.bridge.persistence;

public interface Persistence {

    String persist(Object object);
    Object findById(String id);
    void deleteById(String id);

}
