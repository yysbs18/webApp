package net.imwork.amorgemini.user;

import net.imwork.amorgemini.entity.User;
import net.imwork.amorgemini.service.user.UserService;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/2/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml",
        "classpath:spring-hibernate.xml"})
public class TestUserService {
    private static final Logger LOGGER = Logger
            .getLogger(TestUserService.class);

    @Autowired
    private UserService userService;

    @Test
    public void save1() {
        User user = new User();
        user.setName("zzz");
        user.setPassword("123456");
        Integer id = userService.save(user);
        LOGGER.info(id);
    }

    @Test
    public void findAll2() {
        LOGGER.info(JSONArray.fromObject(userService.findAll()));
    }
}
