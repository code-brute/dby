package com.dby.shop.entity;

import com.dby.shop.config.base.Entity;
import java.io.Serializable;
import java.util.Date;

public class SysUser extends Entity implements Serializable {
    private Integer id;

    private String loginName;

    private String cpmpanyMail;

    private String cpmpanyAddress;

    private String cpmpanyPhone;

    private String cpmpanyName;

    private Integer industry;

    private String contactMail;

    private String contactPhone;

    private String contactName;

    private String storeName;

    private String doorHeadPhoto;

    private String checkoutCounterPhoto;

    private String businessLicensePhoto;

    private Integer userType;

    private String businessHours;

    private Integer status;

    private String password;

    private String salt;

    private Date pwdSetTime;

    private Date pwdInactiveTime;

    private String lastPwd;

    private Integer initPwdFlag;

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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getCpmpanyMail() {
        return cpmpanyMail;
    }

    public void setCpmpanyMail(String cpmpanyMail) {
        this.cpmpanyMail = cpmpanyMail;
    }

    public String getCpmpanyAddress() {
        return cpmpanyAddress;
    }

    public void setCpmpanyAddress(String cpmpanyAddress) {
        this.cpmpanyAddress = cpmpanyAddress;
    }

    public String getCpmpanyPhone() {
        return cpmpanyPhone;
    }

    public void setCpmpanyPhone(String cpmpanyPhone) {
        this.cpmpanyPhone = cpmpanyPhone;
    }

    public String getCpmpanyName() {
        return cpmpanyName;
    }

    public void setCpmpanyName(String cpmpanyName) {
        this.cpmpanyName = cpmpanyName;
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getDoorHeadPhoto() {
        return doorHeadPhoto;
    }

    public void setDoorHeadPhoto(String doorHeadPhoto) {
        this.doorHeadPhoto = doorHeadPhoto;
    }

    public String getCheckoutCounterPhoto() {
        return checkoutCounterPhoto;
    }

    public void setCheckoutCounterPhoto(String checkoutCounterPhoto) {
        this.checkoutCounterPhoto = checkoutCounterPhoto;
    }

    public String getBusinessLicensePhoto() {
        return businessLicensePhoto;
    }

    public void setBusinessLicensePhoto(String businessLicensePhoto) {
        this.businessLicensePhoto = businessLicensePhoto;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getPwdSetTime() {
        return pwdSetTime;
    }

    public void setPwdSetTime(Date pwdSetTime) {
        this.pwdSetTime = pwdSetTime;
    }

    public Date getPwdInactiveTime() {
        return pwdInactiveTime;
    }

    public void setPwdInactiveTime(Date pwdInactiveTime) {
        this.pwdInactiveTime = pwdInactiveTime;
    }

    public String getLastPwd() {
        return lastPwd;
    }

    public void setLastPwd(String lastPwd) {
        this.lastPwd = lastPwd;
    }

    public Integer getInitPwdFlag() {
        return initPwdFlag;
    }

    public void setInitPwdFlag(Integer initPwdFlag) {
        this.initPwdFlag = initPwdFlag;
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
        SysUser other = (SysUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getCpmpanyMail() == null ? other.getCpmpanyMail() == null : this.getCpmpanyMail().equals(other.getCpmpanyMail()))
            && (this.getCpmpanyAddress() == null ? other.getCpmpanyAddress() == null : this.getCpmpanyAddress().equals(other.getCpmpanyAddress()))
            && (this.getCpmpanyPhone() == null ? other.getCpmpanyPhone() == null : this.getCpmpanyPhone().equals(other.getCpmpanyPhone()))
            && (this.getCpmpanyName() == null ? other.getCpmpanyName() == null : this.getCpmpanyName().equals(other.getCpmpanyName()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getContactMail() == null ? other.getContactMail() == null : this.getContactMail().equals(other.getContactMail()))
            && (this.getContactPhone() == null ? other.getContactPhone() == null : this.getContactPhone().equals(other.getContactPhone()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getDoorHeadPhoto() == null ? other.getDoorHeadPhoto() == null : this.getDoorHeadPhoto().equals(other.getDoorHeadPhoto()))
            && (this.getCheckoutCounterPhoto() == null ? other.getCheckoutCounterPhoto() == null : this.getCheckoutCounterPhoto().equals(other.getCheckoutCounterPhoto()))
            && (this.getBusinessLicensePhoto() == null ? other.getBusinessLicensePhoto() == null : this.getBusinessLicensePhoto().equals(other.getBusinessLicensePhoto()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getBusinessHours() == null ? other.getBusinessHours() == null : this.getBusinessHours().equals(other.getBusinessHours()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getPwdSetTime() == null ? other.getPwdSetTime() == null : this.getPwdSetTime().equals(other.getPwdSetTime()))
            && (this.getPwdInactiveTime() == null ? other.getPwdInactiveTime() == null : this.getPwdInactiveTime().equals(other.getPwdInactiveTime()))
            && (this.getLastPwd() == null ? other.getLastPwd() == null : this.getLastPwd().equals(other.getLastPwd()))
            && (this.getInitPwdFlag() == null ? other.getInitPwdFlag() == null : this.getInitPwdFlag().equals(other.getInitPwdFlag()))
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
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getCpmpanyMail() == null) ? 0 : getCpmpanyMail().hashCode());
        result = prime * result + ((getCpmpanyAddress() == null) ? 0 : getCpmpanyAddress().hashCode());
        result = prime * result + ((getCpmpanyPhone() == null) ? 0 : getCpmpanyPhone().hashCode());
        result = prime * result + ((getCpmpanyName() == null) ? 0 : getCpmpanyName().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getContactMail() == null) ? 0 : getContactMail().hashCode());
        result = prime * result + ((getContactPhone() == null) ? 0 : getContactPhone().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getDoorHeadPhoto() == null) ? 0 : getDoorHeadPhoto().hashCode());
        result = prime * result + ((getCheckoutCounterPhoto() == null) ? 0 : getCheckoutCounterPhoto().hashCode());
        result = prime * result + ((getBusinessLicensePhoto() == null) ? 0 : getBusinessLicensePhoto().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getBusinessHours() == null) ? 0 : getBusinessHours().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getPwdSetTime() == null) ? 0 : getPwdSetTime().hashCode());
        result = prime * result + ((getPwdInactiveTime() == null) ? 0 : getPwdInactiveTime().hashCode());
        result = prime * result + ((getLastPwd() == null) ? 0 : getLastPwd().hashCode());
        result = prime * result + ((getInitPwdFlag() == null) ? 0 : getInitPwdFlag().hashCode());
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
        sb.append(", loginName=").append(loginName);
        sb.append(", cpmpanyMail=").append(cpmpanyMail);
        sb.append(", cpmpanyAddress=").append(cpmpanyAddress);
        sb.append(", cpmpanyPhone=").append(cpmpanyPhone);
        sb.append(", cpmpanyName=").append(cpmpanyName);
        sb.append(", industry=").append(industry);
        sb.append(", contactMail=").append(contactMail);
        sb.append(", contactPhone=").append(contactPhone);
        sb.append(", contactName=").append(contactName);
        sb.append(", storeName=").append(storeName);
        sb.append(", doorHeadPhoto=").append(doorHeadPhoto);
        sb.append(", checkoutCounterPhoto=").append(checkoutCounterPhoto);
        sb.append(", businessLicensePhoto=").append(businessLicensePhoto);
        sb.append(", userType=").append(userType);
        sb.append(", businessHours=").append(businessHours);
        sb.append(", status=").append(status);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", pwdSetTime=").append(pwdSetTime);
        sb.append(", pwdInactiveTime=").append(pwdInactiveTime);
        sb.append(", lastPwd=").append(lastPwd);
        sb.append(", initPwdFlag=").append(initPwdFlag);
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