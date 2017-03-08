package net.imwork.amorgemini.service.user;

import net.imwork.amorgemini.entity.User;
import net.imwork.amorgemini.service.GenericService;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public interface UserService extends GenericService<User, String> {
    User load(String id);

    User get(String id);

    List<User> findAll();

    void persist(User entity);

    String save(User entity);

    void saveOrUpdate(User entity);

    void delete(String id);

    void flush();
}
