package net.imwork.amorgemini.repository;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import javax.annotation.Resource;

/**
 * Created by lvbr on 2017/3/8.
 */
public abstract class GenericDaoImpl {
    @Resource
    SessionFactory sessionFactory;
    final protected Session session_(){
        return sessionFactory.getCurrentSession();
    }
    final protected <T> T load_(Class<T> tClass, Integer id){
        return (T) session_().load(tClass,id);
    }
    final protected <T> T loadByKV_(Class<T> tClass,Object... keyValue){
        Criteria criteria = session_().createCriteria(tClass);
        for(int i = 0;i<keyValue.length;i=i+2){
            criteria.add(Restrictions.eq(String.valueOf(keyValue[i]),keyValue[i+1]));
        }
        return (T) criteria.uniqueResult();
    }
    final protected void save_(Object o){
        session_().save(o);
    }
    final protected void delete_(Object o){
        session_().delete(o);
    }
    final protected void update_(Object o){
        session_().update(o);
    }
    final protected void saveOrUpdate_(Object o){
        session_().saveOrUpdate(o);
    }
    final protected Query query_(String hql){
       return session_().createQuery(hql);
    }
}
