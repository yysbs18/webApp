package net.imwork.amorgemini.user;

import net.imwork.amorgemini.entity.UserEntity;
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
        UserEntity userEntity = new UserEntity();
        userEntity.setName("zzz");
        userEntity.setPassword("123456");
        String id = userService.save(userEntity);
        LOGGER.info(id);
    }

    @Test
    public void findAll2() {
        LOGGER.info(JSONArray.fromObject(userService.findAll()));
    }
}
