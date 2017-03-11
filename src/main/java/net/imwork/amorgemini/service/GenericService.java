package net.imwork.amorgemini.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lvbr on 2017/3/8.
 */
public interface GenericService<T, PK extends Serializable> {
    T load(Integer _id);

    Boolean get(T _entity);

    List<T> findAll();

    void persist(T _entity);

    PK save(T _entity);

    Integer saveOrUpdate(T _entity);

    void delete(PK _id);

    void flush();
}
