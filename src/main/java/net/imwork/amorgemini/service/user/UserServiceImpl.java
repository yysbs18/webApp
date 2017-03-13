package net.imwork.amorgemini.service.user;

import net.imwork.amorgemini.entity.User;
import net.imwork.amorgemini.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User load(Integer id) {
        return userRepository.load(id);
    }

    @Override
    public Boolean get(User _user) {
        return null != userRepository.get(_user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void persist(User entity) {

    }

    @Override
    public Integer save(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public Integer saveOrUpdate(User entity) {
        return userRepository.saveOrUpdate(entity);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void flush() {

    }
}
