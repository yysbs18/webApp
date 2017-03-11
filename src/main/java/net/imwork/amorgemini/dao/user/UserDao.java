package net.imwork.amorgemini.dao.user;

import net.imwork.amorgemini.dao.GenericDao;
import net.imwork.amorgemini.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/25.
 */
@Repository("userDao")
public interface UserDao extends GenericDao<User, Integer> {
}
