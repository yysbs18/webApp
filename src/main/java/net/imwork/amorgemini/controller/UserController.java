package net.imwork.amorgemini.controller;

import net.imwork.amorgemini.entity.User;
import net.imwork.amorgemini.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by lvbr on 2017/2/25.
 */
@Controller
@RequestMapping("user")
public class UserController extends GenericController {
    private static final Logger LOGGER = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/showInfos")
    @ResponseBody
    public Map<String, Object> showUserInfos() {
        LOGGER.info("查询用户全部用户");
        jsonResult.put("data", userService.findAll());
        return jsonResult;
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> saveUser(@RequestBody User user) throws Exception {
        jsonResult.put("data", userService.saveOrUpdate(user));
        return jsonResult;
    }
}
