package net.imwork.amorgemini.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/3/14.
 */
@Entity
@Table(name = "user_group_user_relation", schema = "webapp", catalog = "")
public class UserGroupUserRelation {
    private Integer userGroupId;
    private Integer creataUserId;
    private Timestamp creataTime;
    private Integer modifyUserId;
    private Timestamp modifyTime;
    private Byte flag;
    private Integer id;
    private Integer userId;

    @Basic
    @Column(name = "user_group_id",insertable=false,updatable=false)
    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
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
    @Column(name = "creata_time")
    public Timestamp getCreataTime() {
        return creataTime;
    }

    public void setCreataTime(Timestamp creataTime) {
        this.creataTime = creataTime;
    }

    @Basic
    @Column(name = "modify_user_id")
    public Integer getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
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

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserGroupUserRelation that = (UserGroupUserRelation) o;

        if (userGroupId != null ? !userGroupId.equals(that.userGroupId) : that.userGroupId != null) return false;
        if (creataUserId != null ? !creataUserId.equals(that.creataUserId) : that.creataUserId != null) return false;
        if (creataTime != null ? !creataTime.equals(that.creataTime) : that.creataTime != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return userId != null ? userId.equals(that.userId) : that.userId == null;
    }

    @Override
    public int hashCode() {
        int result = userGroupId != null ? userGroupId.hashCode() : 0;
        result = 31 * result + (creataUserId != null ? creataUserId.hashCode() : 0);
        result = 31 * result + (creataTime != null ? creataTime.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
