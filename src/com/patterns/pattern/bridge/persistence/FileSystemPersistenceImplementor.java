package com.patterns.pattern.bridge.persistence;

import java.util.HashMap;
import java.util.Map;

public class FileSystemPersistenceImplementor implements PersistenceImplementor {

    private Long id = 0L;
    private final Map<Long, Object> storage = new HashMap<>();

    @Override
    public Long saveObject(Object object) {
        storage.put(++id, object);
        System.out.println("save in File System, id = " + id);
        return id;
    }

    @Override
    public void deleteObject(Long id) {
        System.out.println("delete from File System by id = " + id);
        storage.remove(id);
    }

    @Override
    public Object getObject(Long id) {
        System.out.println("find in File System by id = " + id);
        return storage.get(id);
    }
}
