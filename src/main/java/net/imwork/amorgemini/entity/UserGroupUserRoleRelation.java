package net.imwork.amorgemini.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/3/14.
 */
@Entity
@Table(name = "user_group_user_role_relation", schema = "webapp", catalog = "")
public class UserGroupUserRoleRelation {
    private Integer userGroupId;
    private Integer userRoleId;
    private Timestamp creataTime;
    private Timestamp modifyTime;
    private Byte flag;
    private Integer creataUserId;
    private Integer modifyUserId;
    private Integer id;

    @Basic
    @Column(name = "user_group_id")
    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    @Basic
    @Column(name = "user_role_id")
    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Basic
    @Column(name = "creata_time")
    public Timestamp getCreataTime() {
        return creataTime;
    }

    public void setCreataTime(Timestamp creataTime) {
        this.creataTime = creataTime;
    }

    @Basic
    @Column(name = "modify_time")
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "flag")
    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "creata_user_id")
    public Integer getCreataUserId() {
        return creataUserId;
    }

    public void setCreataUserId(Integer creataUserId) {
        this.creataUserId = creataUserId;
    }

    @Basic
    @Column(name = "modify_user_id")
    public Integer getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserGroupUserRoleRelation that = (UserGroupUserRoleRelation) o;

        if (userGroupId != null ? !userGroupId.equals(that.userGroupId) : that.userGroupId != null) return false;
        if (userRoleId != null ? !userRoleId.equals(that.userRoleId) : that.userRoleId != null) return false;
        if (creataTime != null ? !creataTime.equals(that.creataTime) : that.creataTime != null) return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (creataUserId != null ? !creataUserId.equals(that.creataUserId) : that.creataUserId != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        int result = userGroupId != null ? userGroupId.hashCode() : 0;
        result = 31 * result + (userRoleId != null ? userRoleId.hashCode() : 0);
        result = 31 * result + (creataTime != null ? creataTime.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (creataUserId != null ? creataUserId.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
