package net.imwork.amorgemini.service.user;

import net.imwork.amorgemini.dao.user.UserDao;
import net.imwork.amorgemini.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User load(Integer id) {
        return userDao.load(id);
    }

    @Override
    public Boolean get(User _user) {
        return null != userDao.get(_user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void persist(User entity) {

    }

    @Override
    public Integer save(User entity) {
        return userDao.save(entity);
    }

    @Override
    public Integer saveOrUpdate(User entity) {
        return userDao.saveOrUpdate(entity);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void flush() {

    }
}
