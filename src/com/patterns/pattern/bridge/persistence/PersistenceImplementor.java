package com.patterns.pattern.bridge.persistence;

public interface PersistenceImplementor {

    Long saveObject(Object object);

    void deleteObject(Long id);

    Object getObject(Long id);

}
