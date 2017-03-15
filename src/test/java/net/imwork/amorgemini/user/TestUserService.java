package net.imwork.amorgemini.user;

import net.imwork.amorgemini.controller.GenericController;
import net.imwork.amorgemini.entity.User;
import net.imwork.amorgemini.service.user.UserService;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/2/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestUserService extends GenericController{
    private static final Logger LOGGER = Logger
            .getLogger(TestUserService.class);

    @Autowired
    private UserService userService;

    @Test
    public void save1() {
        User user = new User();
        user.setUsername("zzz");
        user.setPassword("123456");
        user.setEmail("123456@163.com");
        user.setToken("123456@163.com");
        jsonResult.put("id", userService.save(user));
        LOGGER.info(jsonResult);
    }
    @Test
    public void get2() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("962464");
        jsonResult.put("isExist", userService.get(user));
        LOGGER.info(jsonResult);
    }

    @Test
    public void findAll3() {
        LOGGER.info(JSONArray.fromObject(userService.findAll()));
    }
}
