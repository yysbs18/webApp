package net.imwork.amorgemini.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by lvbr on 2017/3/11.
 */
@Entity
public class User {
    private String password;
    private int userId;
    private String uuid;
    private String email;
    private String username;
    private Byte sex;
    private String token;
    private Integer creataUserId;
    private Timestamp creataTime;
    private Integer modifyUserId;
    private Timestamp modifyTime;
    private Byte flag;
    private User userByModifyUserId;
    private Collection<User> usersByUserId;
    private Collection<UserGroupUserRelation> userGroupUserRelationsByUserId;
    private Collection<UserRoleRelation> userRoleRelationsByUserId;

    @Basic
    @Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "uuid", nullable = false, length = 32)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 64)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 32)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "sex", nullable = true)
    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "token", nullable = false, length = 32)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

        User user = (User) o;

        if (userId != user.userId) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (uuid != null ? !uuid.equals(user.uuid) : user.uuid != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (token != null ? !token.equals(user.token) : user.token != null) return false;
        if (creataUserId != null ? !creataUserId.equals(user.creataUserId) : user.creataUserId != null) return false;
        if (creataTime != null ? !creataTime.equals(user.creataTime) : user.creataTime != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(user.modifyUserId) : user.modifyUserId != null) return false;
        if (modifyTime != null ? !modifyTime.equals(user.modifyTime) : user.modifyTime != null) return false;
        return flag != null ? flag.equals(user.flag) : user.flag == null;
    }

    @Override
    public int hashCode() {
        int result = password != null ? password.hashCode() : 0;
        result = 31 * result + userId;
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (creataUserId != null ? creataUserId.hashCode() : 0);
        result = 31 * result + (creataTime != null ? creataTime.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "modify_user_id", referencedColumnName = "user_id")
    public User getUserByModifyUserId() {
        return userByModifyUserId;
    }

    public void setUserByModifyUserId(User userByModifyUserId) {
        this.userByModifyUserId = userByModifyUserId;
    }

    @OneToMany(mappedBy = "userByModifyUserId")
    public Collection<User> getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Collection<User> usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserGroupUserRelation> getUserGroupUserRelationsByUserId() {
        return userGroupUserRelationsByUserId;
    }

    public void setUserGroupUserRelationsByUserId(Collection<UserGroupUserRelation> userGroupUserRelationsByUserId) {
        this.userGroupUserRelationsByUserId = userGroupUserRelationsByUserId;
    }

    @OneToMany(mappedBy = "userByUserid")
    public Collection<UserRoleRelation> getUserRoleRelationsByUserId() {
        return userRoleRelationsByUserId;
    }

    public void setUserRoleRelationsByUserId(Collection<UserRoleRelation> userRoleRelationsByUserId) {
        this.userRoleRelationsByUserId = userRoleRelationsByUserId;
    }
}
