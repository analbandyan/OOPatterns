package com.patterns.pattern.bridge.persistence;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.out;

public class PersistenceCaching implements Persistence {

    private final PersistenceImplementor persistenceImplementor;
    //ignoring "mock" cache capacity
    private final Map<String, Object> cache = new LinkedHashMap<>();

    public PersistenceCaching(PersistenceImplementor persistenceImplementor) {
        this.persistenceImplementor = persistenceImplementor;
    }

    @Override
    public String persist(Object object) {
        out.println("PersistenceCaching.persist");
        String id = Long.toString(
                persistenceImplementor.saveObject(object)
        );
        cache.put(id, object);
        return id;
    }

    @Override
    public Object findById(String id) {
        out.println("PersistenceCaching.findById");
        Object result = cache.get(id);
        if (result == null) {
            result =
                    persistenceImplementor.getObject(
                            Long.parseLong(id)
                    );
            cache.put(id, result);
        }

        return result;
    }

    @Override
    public void deleteById(String id) {
        out.println("PersistenceCaching.deleteById");
        cache.remove(id);
        persistenceImplementor.deleteObject(
                Long.parseLong(id)
        );
    }

}
