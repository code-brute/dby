package com.dby.shop.entity;

import com.dby.shop.config.base.Entity;
import java.io.Serializable;
import java.util.Date;

public class DeviceHardware extends Entity implements Serializable {
    private Integer id;

    private Integer deviceId;

    private String screenWidth;

    private String screenHeight;

    private String diskspace;

    private String softwareVersion;

    private String screenRotate;

    private String deviceCpu;

    private String useSpace;

    private String latitude;

    private String longitude;

    private String address;

    private String addressHeight;

    private String cityName;

    private String mac;

    private Integer camera;

    private String deviceIp;

    private String contactName;

    private String contactPhone;

    private Date operateTime;

    private String firmName;

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

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(String screenWidth) {
        this.screenWidth = screenWidth;
    }

    public String getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(String screenHeight) {
        this.screenHeight = screenHeight;
    }

    public String getDiskspace() {
        return diskspace;
    }

    public void setDiskspace(String diskspace) {
        this.diskspace = diskspace;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getScreenRotate() {
        return screenRotate;
    }

    public void setScreenRotate(String screenRotate) {
        this.screenRotate = screenRotate;
    }

    public String getDeviceCpu() {
        return deviceCpu;
    }

    public void setDeviceCpu(String deviceCpu) {
        this.deviceCpu = deviceCpu;
    }

    public String getUseSpace() {
        return useSpace;
    }

    public void setUseSpace(String useSpace) {
        this.useSpace = useSpace;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressHeight() {
        return addressHeight;
    }

    public void setAddressHeight(String addressHeight) {
        this.addressHeight = addressHeight;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Integer getCamera() {
        return camera;
    }

    public void setCamera(Integer camera) {
        this.camera = camera;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
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
        DeviceHardware other = (DeviceHardware) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getScreenWidth() == null ? other.getScreenWidth() == null : this.getScreenWidth().equals(other.getScreenWidth()))
            && (this.getScreenHeight() == null ? other.getScreenHeight() == null : this.getScreenHeight().equals(other.getScreenHeight()))
            && (this.getDiskspace() == null ? other.getDiskspace() == null : this.getDiskspace().equals(other.getDiskspace()))
            && (this.getSoftwareVersion() == null ? other.getSoftwareVersion() == null : this.getSoftwareVersion().equals(other.getSoftwareVersion()))
            && (this.getScreenRotate() == null ? other.getScreenRotate() == null : this.getScreenRotate().equals(other.getScreenRotate()))
            && (this.getDeviceCpu() == null ? other.getDeviceCpu() == null : this.getDeviceCpu().equals(other.getDeviceCpu()))
            && (this.getUseSpace() == null ? other.getUseSpace() == null : this.getUseSpace().equals(other.getUseSpace()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAddressHeight() == null ? other.getAddressHeight() == null : this.getAddressHeight().equals(other.getAddressHeight()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getMac() == null ? other.getMac() == null : this.getMac().equals(other.getMac()))
            && (this.getCamera() == null ? other.getCamera() == null : this.getCamera().equals(other.getCamera()))
            && (this.getDeviceIp() == null ? other.getDeviceIp() == null : this.getDeviceIp().equals(other.getDeviceIp()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
            && (this.getContactPhone() == null ? other.getContactPhone() == null : this.getContactPhone().equals(other.getContactPhone()))
            && (this.getOperateTime() == null ? other.getOperateTime() == null : this.getOperateTime().equals(other.getOperateTime()))
            && (this.getFirmName() == null ? other.getFirmName() == null : this.getFirmName().equals(other.getFirmName()))
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
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getScreenWidth() == null) ? 0 : getScreenWidth().hashCode());
        result = prime * result + ((getScreenHeight() == null) ? 0 : getScreenHeight().hashCode());
        result = prime * result + ((getDiskspace() == null) ? 0 : getDiskspace().hashCode());
        result = prime * result + ((getSoftwareVersion() == null) ? 0 : getSoftwareVersion().hashCode());
        result = prime * result + ((getScreenRotate() == null) ? 0 : getScreenRotate().hashCode());
        result = prime * result + ((getDeviceCpu() == null) ? 0 : getDeviceCpu().hashCode());
        result = prime * result + ((getUseSpace() == null) ? 0 : getUseSpace().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAddressHeight() == null) ? 0 : getAddressHeight().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getMac() == null) ? 0 : getMac().hashCode());
        result = prime * result + ((getCamera() == null) ? 0 : getCamera().hashCode());
        result = prime * result + ((getDeviceIp() == null) ? 0 : getDeviceIp().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getContactPhone() == null) ? 0 : getContactPhone().hashCode());
        result = prime * result + ((getOperateTime() == null) ? 0 : getOperateTime().hashCode());
        result = prime * result + ((getFirmName() == null) ? 0 : getFirmName().hashCode());
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
        sb.append(", deviceId=").append(deviceId);
        sb.append(", screenWidth=").append(screenWidth);
        sb.append(", screenHeight=").append(screenHeight);
        sb.append(", diskspace=").append(diskspace);
        sb.append(", softwareVersion=").append(softwareVersion);
        sb.append(", screenRotate=").append(screenRotate);
        sb.append(", deviceCpu=").append(deviceCpu);
        sb.append(", useSpace=").append(useSpace);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", address=").append(address);
        sb.append(", addressHeight=").append(addressHeight);
        sb.append(", cityName=").append(cityName);
        sb.append(", mac=").append(mac);
        sb.append(", camera=").append(camera);
        sb.append(", deviceIp=").append(deviceIp);
        sb.append(", contactName=").append(contactName);
        sb.append(", contactPhone=").append(contactPhone);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", firmName=").append(firmName);
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