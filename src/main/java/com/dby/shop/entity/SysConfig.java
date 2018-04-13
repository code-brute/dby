package com.dby.shop.entity;

import com.dby.shop.config.base.Entity;
import java.io.Serializable;
import java.util.Date;

public class SysConfig extends Entity implements Serializable {
    private Integer id;

    private String prpty;

    private String prptyValue;

    private String prptyName;

    private Integer status;

    private String lastModifyBy;

    private Date lastModifyDate;

    private String createBy;

    private Date createDate;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrpty() {
        return prpty;
    }

    public void setPrpty(String prpty) {
        this.prpty = prpty;
    }

    public String getPrptyValue() {
        return prptyValue;
    }

    public void setPrptyValue(String prptyValue) {
        this.prptyValue = prptyValue;
    }

    public String getPrptyName() {
        return prptyName;
    }

    public void setPrptyName(String prptyName) {
        this.prptyName = prptyName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysConfig other = (SysConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPrpty() == null ? other.getPrpty() == null : this.getPrpty().equals(other.getPrpty()))
            && (this.getPrptyValue() == null ? other.getPrptyValue() == null : this.getPrptyValue().equals(other.getPrptyValue()))
            && (this.getPrptyName() == null ? other.getPrptyName() == null : this.getPrptyName().equals(other.getPrptyName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLastModifyBy() == null ? other.getLastModifyBy() == null : this.getLastModifyBy().equals(other.getLastModifyBy()))
            && (this.getLastModifyDate() == null ? other.getLastModifyDate() == null : this.getLastModifyDate().equals(other.getLastModifyDate()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPrpty() == null) ? 0 : getPrpty().hashCode());
        result = prime * result + ((getPrptyValue() == null) ? 0 : getPrptyValue().hashCode());
        result = prime * result + ((getPrptyName() == null) ? 0 : getPrptyName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLastModifyBy() == null) ? 0 : getLastModifyBy().hashCode());
        result = prime * result + ((getLastModifyDate() == null) ? 0 : getLastModifyDate().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prpty=").append(prpty);
        sb.append(", prptyValue=").append(prptyValue);
        sb.append(", prptyName=").append(prptyName);
        sb.append(", status=").append(status);
        sb.append(", lastModifyBy=").append(lastModifyBy);
        sb.append(", lastModifyDate=").append(lastModifyDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}