package net.imwork.amorgemini.service.menu;

import net.imwork.amorgemini.entity.Menu;
import net.imwork.amorgemini.repository.menu.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu load(Integer _id) {
        return null;
    }

    @Override
    public Boolean get(Menu _entity) {
        return null;
    }

    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    @Override
    public void persist(Menu _entity) {

    }

    @Override
    public Integer save(Menu _entity) {
        return null;
    }

    @Override
    public Integer saveOrUpdate(Menu _entity) {
        return null;
    }

    @Override
    public void delete(Integer _id) {

    }

    @Override
    public void flush() {

    }
}
