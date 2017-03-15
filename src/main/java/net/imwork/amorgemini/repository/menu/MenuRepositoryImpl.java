package net.imwork.amorgemini.repository.menu;

import net.imwork.amorgemini.entity.Menu;
import net.imwork.amorgemini.repository.GenericRepositoryImpl;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/3/12.
 */
@Repository("menuRepositoryImpl")
public class MenuRepositoryImpl extends GenericRepositoryImpl implements MenuRepository {
    @Override
    public Menu load(Integer _id) {
        return null;
    }

    @Override
    public Menu get(Menu _entity) {
        return null;
    }

    @Override
    public List<Menu> findAll() {
        List<Menu> menus = session_().createQuery("select m.menuId as menuId,m.menuName as menuName from Menu m").setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
//        List<Menu> menus=query_("from Menu m where m.flag>0").setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
        return menus;
    }

    @Override
    public void persist(Menu _entity) {

    }

    @Override
    public Integer save(Menu entity) {
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
