package net.imwork.amorgemini.repository.user;

import net.imwork.amorgemini.entity.User;
import net.imwork.amorgemini.repository.GenericRepositoryImpl;
import net.imwork.amorgemini.util.UUIDUtil;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
@Repository("userDao")
public class UserRepositoryImpl extends GenericRepositoryImpl implements UserRepository {
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
        List<User> userList = session_().createQuery("select u.username as username from User u where u.flag>0").setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
        return userList;
    }

    @Override
    public void persist(User entity) {

    }

    @Override
    public Integer save(User entity) {
        entity.setUuid(UUIDUtil.uuid());
        entity.setModifyUserId(entity.getUserId());
//        entity.setModifyTime((Timestamp) new Date());
        entity.setFlag((byte) 1);
        save_(entity);
        return entity.getUserId();
    }

    @Override
    public Integer saveOrUpdate(User entity) {
        User u = this.load(entity.getUserId());
        u.setUsername(entity.getUsername());
        u.setEmail(entity.getEmail());
        u.setPassword(entity.getPassword());
        update_(u);
        return u.getUserId();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void flush() {

    }
}
