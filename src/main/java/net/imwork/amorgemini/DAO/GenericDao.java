package net.imwork.amorgemini.DAO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public interface GenericDao<T, PK extends Serializable> {

    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();
}