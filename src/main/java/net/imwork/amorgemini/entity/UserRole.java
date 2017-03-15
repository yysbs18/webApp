package net.imwork.amorgemini.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/3/14.
 */
@Entity
@Table(name = "user_role", schema = "webapp", catalog = "")
public class UserRole {
    private Integer userRoleId;
    private String userRoleName;
    private Timestamp creataTime;
    private Timestamp modifyTime;
    private Byte flag;
    private Integer creataUserId;
    private Integer modifyUserId;

    @Id
    @Column(name = "user_role_id")
    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Basic
    @Column(name = "user_role_name")
    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        if (userRoleId != null ? !userRoleId.equals(userRole.userRoleId) : userRole.userRoleId != null) return false;
        if (userRoleName != null ? !userRoleName.equals(userRole.userRoleName) : userRole.userRoleName != null)
            return false;
        if (creataTime != null ? !creataTime.equals(userRole.creataTime) : userRole.creataTime != null) return false;
        if (modifyTime != null ? !modifyTime.equals(userRole.modifyTime) : userRole.modifyTime != null) return false;
        if (flag != null ? !flag.equals(userRole.flag) : userRole.flag != null) return false;
        if (creataUserId != null ? !creataUserId.equals(userRole.creataUserId) : userRole.creataUserId != null)
            return false;
        return modifyUserId != null ? modifyUserId.equals(userRole.modifyUserId) : userRole.modifyUserId == null;
    }

    @Override
    public int hashCode() {
        int result = userRoleId != null ? userRoleId.hashCode() : 0;
        result = 31 * result + (userRoleName != null ? userRoleName.hashCode() : 0);
        result = 31 * result + (creataTime != null ? creataTime.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (creataUserId != null ? creataUserId.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        return result;
    }
}
