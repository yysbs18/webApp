package net.imwork.amorgemini.controller;

import net.imwork.amorgemini.entity.User;
import net.imwork.amorgemini.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lvbr on 2017/2/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/showInfos.do")
    @ResponseBody
    public List<User> showUserInfos() {
        LOGGER.info("查询用户全部用户");
        List<User> userInfos = userService.findAll();
        return userInfos;
    }
}
