package net.imwork.amorgemini.repository.menu;

import net.imwork.amorgemini.entity.Menu;
import net.imwork.amorgemini.repository.GenericRepositoryImpl;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;
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
        List<Menu> menus=query_("select m.menuUrl as menuUrl,m.menuName as menuName,m.menuFid as menuFid,m.sort as sort,m.flag as flag from Menu m  order by m.sort").setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
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
        _entity.setMenuId(1);
        _entity.setModifyTime(new Timestamp(new Date().getTime()));
        save_(_entity);
        return null;
    }

    @Override
    public void delete(Integer _id) {

    }

    @Override
    public void flush() {

    }
}
