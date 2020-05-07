package com.patterns.pattern.bridge.persistence;

import static java.lang.System.out;

public class PersistenceDefault implements Persistence {

    private final PersistenceImplementor persistenceImplementor;

    public PersistenceDefault(PersistenceImplementor persistenceImplementor) {
        this.persistenceImplementor = persistenceImplementor;
    }

    @Override
    public String persist(Object object) {
        out.println("PersistenceDefault.persist");
        return Long.toString(
                persistenceImplementor.saveObject(object)
        );
    }

    @Override
    public Object findById(String id) {
        out.println("PersistenceDefault.findById");
        return persistenceImplementor.getObject(
                Long.parseLong(id)
        );
    }

    @Override
    public void deleteById(String id) {
        out.println("PersistenceDefault.deleteById");
        persistenceImplementor.deleteObject(
                Long.parseLong(id)
        );
    }
}
