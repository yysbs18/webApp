package net.imwork.amorgemini.menu;

import net.imwork.amorgemini.service.menu.MenuService;
import net.imwork.amorgemini.user.TestUserService;
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
 * Created by Administrator on 2017/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMenuService {
    private static final Logger LOGGER = Logger
            .getLogger(TestUserService.class);

    @Autowired
    private MenuService menuService;

    @Test
    public void findAll3() {
        LOGGER.info(JSONArray.fromObject(menuService.findAll()));
    }
}
