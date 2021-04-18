package org.example.bl;

import java.util.List;

public interface CrudService<T> {

    List<T> getAll();

    T getById(Long id);

    T create(T object);

    T update(T object);

    void delete(Long id);

}
