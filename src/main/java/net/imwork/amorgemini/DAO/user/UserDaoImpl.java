package net.imwork.amorgemini.DAO.user;

import net.imwork.amorgemini.entity.User;
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
    public User load(String id) {
        return (User) this.getCurrentSession().load(User.class, id);
    }

    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = this.getCurrentSession().createQuery("from User ").setCacheable(true).list();
        return userList;
    }

    @Override
    public void persist(User entity) {

    }

    @Override
    public String save(User entity) {
        return String.valueOf(this.getCurrentSession().save(entity));
    }

    @Override
    public void saveOrUpdate(User entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void flush() {

    }
}
