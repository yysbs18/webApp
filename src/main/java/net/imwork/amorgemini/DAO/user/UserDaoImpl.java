package net.imwork.amorgemini.DAO.user;

import net.imwork.amorgemini.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public UserEntity load(String id) {
        return (UserEntity) this.getCurrentSession().load(UserEntity.class, id);
    }

    @Override
    public UserEntity get(String id) {
        return null;
    }

    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> userList = this.getCurrentSession().createQuery("from UserEntity ").setCacheable(true).list();
        return userList;
    }

    @Override
    public void persist(UserEntity entity) {

    }

    @Override
    public String save(UserEntity entity) {
        return null;
    }

    @Override
    public void saveOrUpdate(UserEntity entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void flush() {

    }
}
