package net.imwork.amorgemini.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by lvbr on 2017/3/11.
 */
@Entity
public class Menu {
    private Integer menuId;
    private String menuName;
    private String menuUrl;
    private Integer menuFid;
    private Integer sort;
    private Integer creataUserId;
    private Timestamp creataTime;
    private Integer modifyUserId;
    private Timestamp modifyTime;
    private Boolean flag;
    private Collection<MenuPermissionRelation> menuPermissionRelationsByMenuId;

    @Id
    @Column(name = "menu_id", nullable = false)
    public Integer  getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer  menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "menu_name", nullable = false, length = 32)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "menu_url", nullable = false, length = 64)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Basic
    @Column(name = "menu_fid", nullable = true)
    public Integer getMenuFid() {
        return menuFid;
    }

    public void setMenuFid(Integer menuFid) {
        this.menuFid = menuFid;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "creata_user_id", nullable = true)
    public Integer getCreataUserId() {
        return creataUserId;
    }

    public void setCreataUserId(Integer creataUserId) {
        this.creataUserId = creataUserId;
    }

    @Basic
    @Column(name = "creata_time", nullable = false)
    public Timestamp getCreataTime() {
        return creataTime;
    }

    public void setCreataTime(Timestamp creataTime) {
        this.creataTime = creataTime;
    }

    @Basic
    @Column(name = "modify_user_id", nullable = true)
    public Integer getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    @Basic
    @Column(name = "modify_time", nullable = false)
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "flag", nullable = true)
    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (menuId != menu.menuId) return false;
        if (menuName != null ? !menuName.equals(menu.menuName) : menu.menuName != null) return false;
        if (menuUrl != null ? !menuUrl.equals(menu.menuUrl) : menu.menuUrl != null) return false;
        if (menuFid != null ? !menuFid.equals(menu.menuFid) : menu.menuFid != null) return false;
        if (sort != null ? !sort.equals(menu.sort) : menu.sort != null) return false;
        if (creataUserId != null ? !creataUserId.equals(menu.creataUserId) : menu.creataUserId != null) return false;
        if (creataTime != null ? !creataTime.equals(menu.creataTime) : menu.creataTime != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(menu.modifyUserId) : menu.modifyUserId != null) return false;
        if (modifyTime != null ? !modifyTime.equals(menu.modifyTime) : menu.modifyTime != null) return false;
        return flag != null ? flag.equals(menu.flag) : menu.flag == null;
    }

    @Override
    public int hashCode() {
        int result = menuId;
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (menuUrl != null ? menuUrl.hashCode() : 0);
        result = 31 * result + (menuFid != null ? menuFid.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (creataUserId != null ? creataUserId.hashCode() : 0);
        result = 31 * result + (creataTime != null ? creataTime.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "menuByMenuId")
    public Collection<MenuPermissionRelation> getMenuPermissionRelationsByMenuId() {
        return menuPermissionRelationsByMenuId;
    }

    public void setMenuPermissionRelationsByMenuId(Collection<MenuPermissionRelation> menuPermissionRelationsByMenuId) {
        this.menuPermissionRelationsByMenuId = menuPermissionRelationsByMenuId;
    }
}
