package net.imwork.amorgemini.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lvbr on 2017/3/8.
 */
public interface GenericService<T, PK extends Serializable> {
    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();
}
