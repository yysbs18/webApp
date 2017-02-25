package net.imwork.amorgemini.service.user;

import net.imwork.amorgemini.DAO.user.UserDao;
import net.imwork.amorgemini.entity.UserEntity;
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
    public UserEntity load(String id) {
        return userDao.load(id);
    }

    @Override
    public UserEntity get(String id) {
        return null;
    }

    @Override
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }

    @Override
    public void persist(UserEntity entity) {

    }

    @Override
    public String save(UserEntity entity) {
        return userDao.save(entity);
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
