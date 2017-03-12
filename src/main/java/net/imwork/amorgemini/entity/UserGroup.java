package net.imwork.amorgemini.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by Administrator on 2017/3/12.
 */
@Entity
@Table(name = "user_group", schema = "webapp", catalog = "")
public class UserGroup {
    private Integer userGroupId;
    private String userGroupName;
    private Integer userGroupFid;
    private Integer creataUserId;
    private Timestamp creataTime;
    private Integer modifyUserId;
    private Timestamp modifyTime;
    private Boolean flag;
    private Collection<UserGroupUserRelation> userGroupUserRelationsByUserGroupId;
    private Collection<UserGroupUserRoleRelation> userGroupUserRoleRelationsByUserGroupId;

    @Id
    @Column(name = "user_group_id")
    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    @Basic
    @Column(name = "user_group_name")
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    @Basic
    @Column(name = "user_group_fid")
    public Integer getUserGroupFid() {
        return userGroupFid;
    }

    public void setUserGroupFid(Integer userGroupFid) {
        this.userGroupFid = userGroupFid;
    }

    @Basic
    @Column(name = "creata_user_id",insertable=false,updatable=false)
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
    @Column(name = "modify_user_id",insertable=false,updatable=false)
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

        UserGroup userGroup = (UserGroup) o;

        if (userGroupId != null ? !userGroupId.equals(userGroup.userGroupId) : userGroup.userGroupId != null)
            return false;
        if (userGroupName != null ? !userGroupName.equals(userGroup.userGroupName) : userGroup.userGroupName != null)
            return false;
        if (userGroupFid != null ? !userGroupFid.equals(userGroup.userGroupFid) : userGroup.userGroupFid != null)
            return false;
        if (creataUserId != null ? !creataUserId.equals(userGroup.creataUserId) : userGroup.creataUserId != null)
            return false;
        if (creataTime != null ? !creataTime.equals(userGroup.creataTime) : userGroup.creataTime != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(userGroup.modifyUserId) : userGroup.modifyUserId != null)
            return false;
        if (modifyTime != null ? !modifyTime.equals(userGroup.modifyTime) : userGroup.modifyTime != null) return false;
        return flag != null ? flag.equals(userGroup.flag) : userGroup.flag == null;
    }

    @Override
    public int hashCode() {
        int result = userGroupId != null ? userGroupId.hashCode() : 0;
        result = 31 * result + (userGroupName != null ? userGroupName.hashCode() : 0);
        result = 31 * result + (userGroupFid != null ? userGroupFid.hashCode() : 0);
        result = 31 * result + (creataUserId != null ? creataUserId.hashCode() : 0);
        result = 31 * result + (creataTime != null ? creataTime.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userGroupByUserGroupId")
    public Collection<UserGroupUserRelation> getUserGroupUserRelationsByUserGroupId() {
        return userGroupUserRelationsByUserGroupId;
    }

    public void setUserGroupUserRelationsByUserGroupId(Collection<UserGroupUserRelation> userGroupUserRelationsByUserGroupId) {
        this.userGroupUserRelationsByUserGroupId = userGroupUserRelationsByUserGroupId;
    }

    @OneToMany(mappedBy = "userGroupByUserGroupId")
    public Collection<UserGroupUserRoleRelation> getUserGroupUserRoleRelationsByUserGroupId() {
        return userGroupUserRoleRelationsByUserGroupId;
    }

    public void setUserGroupUserRoleRelationsByUserGroupId(Collection<UserGroupUserRoleRelation> userGroupUserRoleRelationsByUserGroupId) {
        this.userGroupUserRoleRelationsByUserGroupId = userGroupUserRoleRelationsByUserGroupId;
    }
}
