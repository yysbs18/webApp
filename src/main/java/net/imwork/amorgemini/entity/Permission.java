package net.imwork.amorgemini.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by lvbr on 2017/3/11.
 */
@Entity
public class Permission {
    private int permissionId;
    private String permissionType;
    private Integer creataUserId;
    private Timestamp creataTime;
    private Integer modifyUserId;
    private Timestamp modifyTime;
    private Byte flag;
    private Collection<MenuPermissionRelation> menuPermissionRelationsByPermissionId;
    private Collection<PermissionOperationRelation> permissionOperationRelationsByPermissionId;
    private Collection<UserRolePermissionRalation> userRolePermissionRalationsByPermissionId;

    @Id
    @Column(name = "permission_id", nullable = false)
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Basic
    @Column(name = "permission_type", nullable = false, length = 32)
    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
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
    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permission that = (Permission) o;

        if (permissionId != that.permissionId) return false;
        if (permissionType != null ? !permissionType.equals(that.permissionType) : that.permissionType != null)
            return false;
        if (creataUserId != null ? !creataUserId.equals(that.creataUserId) : that.creataUserId != null) return false;
        if (creataTime != null ? !creataTime.equals(that.creataTime) : that.creataTime != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;
        return flag != null ? flag.equals(that.flag) : that.flag == null;
    }

    @Override
    public int hashCode() {
        int result = permissionId;
        result = 31 * result + (permissionType != null ? permissionType.hashCode() : 0);
        result = 31 * result + (creataUserId != null ? creataUserId.hashCode() : 0);
        result = 31 * result + (creataTime != null ? creataTime.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "permissionByPermissionId")
    public Collection<MenuPermissionRelation> getMenuPermissionRelationsByPermissionId() {
        return menuPermissionRelationsByPermissionId;
    }

    public void setMenuPermissionRelationsByPermissionId(Collection<MenuPermissionRelation> menuPermissionRelationsByPermissionId) {
        this.menuPermissionRelationsByPermissionId = menuPermissionRelationsByPermissionId;
    }

    @OneToMany(mappedBy = "permissionByPermissionId")
    public Collection<PermissionOperationRelation> getPermissionOperationRelationsByPermissionId() {
        return permissionOperationRelationsByPermissionId;
    }

    public void setPermissionOperationRelationsByPermissionId(Collection<PermissionOperationRelation> permissionOperationRelationsByPermissionId) {
        this.permissionOperationRelationsByPermissionId = permissionOperationRelationsByPermissionId;
    }

    @OneToMany(mappedBy = "permissionByPermissionId")
    public Collection<UserRolePermissionRalation> getUserRolePermissionRalationsByPermissionId() {
        return userRolePermissionRalationsByPermissionId;
    }

    public void setUserRolePermissionRalationsByPermissionId(Collection<UserRolePermissionRalation> userRolePermissionRalationsByPermissionId) {
        this.userRolePermissionRalationsByPermissionId = userRolePermissionRalationsByPermissionId;
    }
}