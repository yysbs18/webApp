package net.imwork.amorgemini.DAO.user;

import net.imwork.amorgemini.DAO.GenericDaoImpl;
import net.imwork.amorgemini.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public User load(Integer id) {
        return load_(User.class, id);
    }

    @Override
    public User get(User _user) {
        User user = (User) query_("from User u where (u.username=:n or u.email=:n) and u.password=:p").setParameter("n",_user.getUsername()).setParameter("p",_user.getPassword()).uniqueResult();
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = query_("from User ").setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).setCacheable(true).list();
        return userList;
    }

    @Override
    public void persist(User entity) {

    }

    @Override
    public Integer save(User entity) {
        entity.setUuid("");
        entity.setModifyUserId(entity.getUserId());
        entity.setModifyTime((Timestamp) new Date());
//        entity.setFlag();
        save_(entity);
        return entity.getUserId();
    }

    @Override
    public Integer saveOrUpdate(User entity) {
        User u = this.load(entity.getUserId());
        u.setUsername(entity.getUsername());
        u.setEmail(entity.getEmail());
        u.setPassword(entity.getPassword());
        this.getCurrentSession().update(u);
        return u.getUserId();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void flush() {

    }
}
