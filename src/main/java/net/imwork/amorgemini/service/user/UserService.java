package net.imwork.amorgemini.service.user;

import net.imwork.amorgemini.entity.User;
import net.imwork.amorgemini.service.GenericService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/25.
 */
@Service("userService")
public interface UserService extends GenericService<User, Integer> {
}
