package net.imwork.amorgemini.service.user;

import net.imwork.amorgemini.entity.User;
import net.imwork.amorgemini.service.GenericService;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public interface UserService extends GenericService<User, Integer> {
    User load(Integer id);

    User get(Integer id);

    List<User> findAll();

    void persist(User entity);

    Integer save(User entity);

    Integer saveOrUpdate(User entity);

    void delete(Integer id);

    void flush();
}
