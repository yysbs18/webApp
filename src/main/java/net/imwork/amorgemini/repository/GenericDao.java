package net.imwork.amorgemini.repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public interface GenericDao<T, PK extends Serializable> {
    T load(Integer _id);

    T get(T _entity);

    List<T> findAll();

    void persist(T _entity);

    PK save(T entity);

    PK saveOrUpdate(T _entity);

    void delete(PK _id);

    void flush();
}