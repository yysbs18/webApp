package net.imwork.amorgemini.service.user;

import net.imwork.amorgemini.entity.UserEntity;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public interface UserService {
    UserEntity load(String id);

    UserEntity get(String id);

    List<UserEntity> findAll();

    void persist(UserEntity entity);

    String save(UserEntity entity);

    void saveOrUpdate(UserEntity entity);

    void delete(String id);

    void flush();
}
