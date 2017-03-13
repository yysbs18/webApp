package net.imwork.amorgemini.controller;

import net.imwork.amorgemini.service.menu.MenuService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/12.
 */
@Controller
@RequestMapping("menu")
public class MenuController extends GenericController {
    private static final Logger LOGGER = Logger.getLogger(UserController.class);
    @Autowired
    MenuService menuService;

    @RequestMapping("/getMenus")
    @ResponseBody
    public Map<String, Object> getMenus() {
        List menus = menuService.findAll();
        jsonResult.put("data",menus);
        return jsonResult;
    }
}
