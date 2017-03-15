package net.imwork.amorgemini.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/3/14.
 */
@Entity
public class Operation {
    private Integer operationId;
    private String operationName;
    private String operationCode;
    private String interceptPrefix;
    private Integer operationFid;
    private Integer creataUserId;
    private Timestamp creataTime;
    private Integer modifyUserId;
    private Timestamp modifyTime;
    private Byte flag;

    @Id
    @Column(name = "operation_id")
    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    @Basic
    @Column(name = "operation_name")
    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    @Basic
    @Column(name = "operation_code")
    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    @Basic
    @Column(name = "intercept_prefix")
    public String getInterceptPrefix() {
        return interceptPrefix;
    }

    public void setInterceptPrefix(String interceptPrefix) {
        this.interceptPrefix = interceptPrefix;
    }

    @Basic
    @Column(name = "operation_fid")
    public Integer getOperationFid() {
        return operationFid;
    }

    public void setOperationFid(Integer operationFid) {
        this.operationFid = operationFid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operation operation = (Operation) o;

        if (operationId != null ? !operationId.equals(operation.operationId) : operation.operationId != null)
            return false;
        if (operationName != null ? !operationName.equals(operation.operationName) : operation.operationName != null)
            return false;
        if (operationCode != null ? !operationCode.equals(operation.operationCode) : operation.operationCode != null)
            return false;
        if (interceptPrefix != null ? !interceptPrefix.equals(operation.interceptPrefix) : operation.interceptPrefix != null)
            return false;
        if (operationFid != null ? !operationFid.equals(operation.operationFid) : operation.operationFid != null)
            return false;
        if (creataUserId != null ? !creataUserId.equals(operation.creataUserId) : operation.creataUserId != null)
            return false;
        if (creataTime != null ? !creataTime.equals(operation.creataTime) : operation.creataTime != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(operation.modifyUserId) : operation.modifyUserId != null)
            return false;
        if (modifyTime != null ? !modifyTime.equals(operation.modifyTime) : operation.modifyTime != null) return false;
        return flag != null ? flag.equals(operation.flag) : operation.flag == null;
    }

    @Override
    public int hashCode() {
        int result = operationId != null ? operationId.hashCode() : 0;
        result = 31 * result + (operationName != null ? operationName.hashCode() : 0);
        result = 31 * result + (operationCode != null ? operationCode.hashCode() : 0);
        result = 31 * result + (interceptPrefix != null ? interceptPrefix.hashCode() : 0);
        result = 31 * result + (operationFid != null ? operationFid.hashCode() : 0);
        result = 31 * result + (creataUserId != null ? creataUserId.hashCode() : 0);
        result = 31 * result + (creataTime != null ? creataTime.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        return result;
    }
}
