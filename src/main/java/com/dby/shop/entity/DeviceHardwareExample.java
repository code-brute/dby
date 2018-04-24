package com.dby.shop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceHardwareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceHardwareExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("DEVICE_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("DEVICE_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("DEVICE_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEVICE_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("DEVICE_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEVICE_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("DEVICE_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("DEVICE_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("DEVICE_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEVICE_ID not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andScreenWidthIsNull() {
            addCriterion("SCREEN_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andScreenWidthIsNotNull() {
            addCriterion("SCREEN_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andScreenWidthEqualTo(String value) {
            addCriterion("SCREEN_WIDTH =", value, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthNotEqualTo(String value) {
            addCriterion("SCREEN_WIDTH <>", value, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthGreaterThan(String value) {
            addCriterion("SCREEN_WIDTH >", value, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthGreaterThanOrEqualTo(String value) {
            addCriterion("SCREEN_WIDTH >=", value, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthLessThan(String value) {
            addCriterion("SCREEN_WIDTH <", value, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthLessThanOrEqualTo(String value) {
            addCriterion("SCREEN_WIDTH <=", value, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthLike(String value) {
            addCriterion("SCREEN_WIDTH like", value, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthNotLike(String value) {
            addCriterion("SCREEN_WIDTH not like", value, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthIn(List<String> values) {
            addCriterion("SCREEN_WIDTH in", values, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthNotIn(List<String> values) {
            addCriterion("SCREEN_WIDTH not in", values, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthBetween(String value1, String value2) {
            addCriterion("SCREEN_WIDTH between", value1, value2, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenWidthNotBetween(String value1, String value2) {
            addCriterion("SCREEN_WIDTH not between", value1, value2, "screenWidth");
            return (Criteria) this;
        }

        public Criteria andScreenHeightIsNull() {
            addCriterion("SCREEN_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andScreenHeightIsNotNull() {
            addCriterion("SCREEN_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andScreenHeightEqualTo(String value) {
            addCriterion("SCREEN_HEIGHT =", value, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightNotEqualTo(String value) {
            addCriterion("SCREEN_HEIGHT <>", value, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightGreaterThan(String value) {
            addCriterion("SCREEN_HEIGHT >", value, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightGreaterThanOrEqualTo(String value) {
            addCriterion("SCREEN_HEIGHT >=", value, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightLessThan(String value) {
            addCriterion("SCREEN_HEIGHT <", value, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightLessThanOrEqualTo(String value) {
            addCriterion("SCREEN_HEIGHT <=", value, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightLike(String value) {
            addCriterion("SCREEN_HEIGHT like", value, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightNotLike(String value) {
            addCriterion("SCREEN_HEIGHT not like", value, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightIn(List<String> values) {
            addCriterion("SCREEN_HEIGHT in", values, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightNotIn(List<String> values) {
            addCriterion("SCREEN_HEIGHT not in", values, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightBetween(String value1, String value2) {
            addCriterion("SCREEN_HEIGHT between", value1, value2, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andScreenHeightNotBetween(String value1, String value2) {
            addCriterion("SCREEN_HEIGHT not between", value1, value2, "screenHeight");
            return (Criteria) this;
        }

        public Criteria andDiskspaceIsNull() {
            addCriterion("DISKSPACE is null");
            return (Criteria) this;
        }

        public Criteria andDiskspaceIsNotNull() {
            addCriterion("DISKSPACE is not null");
            return (Criteria) this;
        }

        public Criteria andDiskspaceEqualTo(String value) {
            addCriterion("DISKSPACE =", value, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceNotEqualTo(String value) {
            addCriterion("DISKSPACE <>", value, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceGreaterThan(String value) {
            addCriterion("DISKSPACE >", value, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceGreaterThanOrEqualTo(String value) {
            addCriterion("DISKSPACE >=", value, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceLessThan(String value) {
            addCriterion("DISKSPACE <", value, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceLessThanOrEqualTo(String value) {
            addCriterion("DISKSPACE <=", value, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceLike(String value) {
            addCriterion("DISKSPACE like", value, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceNotLike(String value) {
            addCriterion("DISKSPACE not like", value, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceIn(List<String> values) {
            addCriterion("DISKSPACE in", values, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceNotIn(List<String> values) {
            addCriterion("DISKSPACE not in", values, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceBetween(String value1, String value2) {
            addCriterion("DISKSPACE between", value1, value2, "diskspace");
            return (Criteria) this;
        }

        public Criteria andDiskspaceNotBetween(String value1, String value2) {
            addCriterion("DISKSPACE not between", value1, value2, "diskspace");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNull() {
            addCriterion("SOFTWARE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNotNull() {
            addCriterion("SOFTWARE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionEqualTo(String value) {
            addCriterion("SOFTWARE_VERSION =", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotEqualTo(String value) {
            addCriterion("SOFTWARE_VERSION <>", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThan(String value) {
            addCriterion("SOFTWARE_VERSION >", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTWARE_VERSION >=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThan(String value) {
            addCriterion("SOFTWARE_VERSION <", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThanOrEqualTo(String value) {
            addCriterion("SOFTWARE_VERSION <=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLike(String value) {
            addCriterion("SOFTWARE_VERSION like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotLike(String value) {
            addCriterion("SOFTWARE_VERSION not like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIn(List<String> values) {
            addCriterion("SOFTWARE_VERSION in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotIn(List<String> values) {
            addCriterion("SOFTWARE_VERSION not in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionBetween(String value1, String value2) {
            addCriterion("SOFTWARE_VERSION between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotBetween(String value1, String value2) {
            addCriterion("SOFTWARE_VERSION not between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andScreenRotateIsNull() {
            addCriterion("SCREEN_ROTATE is null");
            return (Criteria) this;
        }

        public Criteria andScreenRotateIsNotNull() {
            addCriterion("SCREEN_ROTATE is not null");
            return (Criteria) this;
        }

        public Criteria andScreenRotateEqualTo(String value) {
            addCriterion("SCREEN_ROTATE =", value, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateNotEqualTo(String value) {
            addCriterion("SCREEN_ROTATE <>", value, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateGreaterThan(String value) {
            addCriterion("SCREEN_ROTATE >", value, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateGreaterThanOrEqualTo(String value) {
            addCriterion("SCREEN_ROTATE >=", value, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateLessThan(String value) {
            addCriterion("SCREEN_ROTATE <", value, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateLessThanOrEqualTo(String value) {
            addCriterion("SCREEN_ROTATE <=", value, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateLike(String value) {
            addCriterion("SCREEN_ROTATE like", value, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateNotLike(String value) {
            addCriterion("SCREEN_ROTATE not like", value, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateIn(List<String> values) {
            addCriterion("SCREEN_ROTATE in", values, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateNotIn(List<String> values) {
            addCriterion("SCREEN_ROTATE not in", values, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateBetween(String value1, String value2) {
            addCriterion("SCREEN_ROTATE between", value1, value2, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andScreenRotateNotBetween(String value1, String value2) {
            addCriterion("SCREEN_ROTATE not between", value1, value2, "screenRotate");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuIsNull() {
            addCriterion("DEVICE_CPU is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuIsNotNull() {
            addCriterion("DEVICE_CPU is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuEqualTo(String value) {
            addCriterion("DEVICE_CPU =", value, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuNotEqualTo(String value) {
            addCriterion("DEVICE_CPU <>", value, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuGreaterThan(String value) {
            addCriterion("DEVICE_CPU >", value, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_CPU >=", value, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuLessThan(String value) {
            addCriterion("DEVICE_CPU <", value, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_CPU <=", value, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuLike(String value) {
            addCriterion("DEVICE_CPU like", value, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuNotLike(String value) {
            addCriterion("DEVICE_CPU not like", value, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuIn(List<String> values) {
            addCriterion("DEVICE_CPU in", values, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuNotIn(List<String> values) {
            addCriterion("DEVICE_CPU not in", values, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuBetween(String value1, String value2) {
            addCriterion("DEVICE_CPU between", value1, value2, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andDeviceCpuNotBetween(String value1, String value2) {
            addCriterion("DEVICE_CPU not between", value1, value2, "deviceCpu");
            return (Criteria) this;
        }

        public Criteria andUseSpaceIsNull() {
            addCriterion("USE_SPACE is null");
            return (Criteria) this;
        }

        public Criteria andUseSpaceIsNotNull() {
            addCriterion("USE_SPACE is not null");
            return (Criteria) this;
        }

        public Criteria andUseSpaceEqualTo(String value) {
            addCriterion("USE_SPACE =", value, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceNotEqualTo(String value) {
            addCriterion("USE_SPACE <>", value, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceGreaterThan(String value) {
            addCriterion("USE_SPACE >", value, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("USE_SPACE >=", value, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceLessThan(String value) {
            addCriterion("USE_SPACE <", value, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceLessThanOrEqualTo(String value) {
            addCriterion("USE_SPACE <=", value, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceLike(String value) {
            addCriterion("USE_SPACE like", value, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceNotLike(String value) {
            addCriterion("USE_SPACE not like", value, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceIn(List<String> values) {
            addCriterion("USE_SPACE in", values, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceNotIn(List<String> values) {
            addCriterion("USE_SPACE not in", values, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceBetween(String value1, String value2) {
            addCriterion("USE_SPACE between", value1, value2, "useSpace");
            return (Criteria) this;
        }

        public Criteria andUseSpaceNotBetween(String value1, String value2) {
            addCriterion("USE_SPACE not between", value1, value2, "useSpace");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("LATITUDE like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("LATITUDE not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("LONGITUDE like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("LONGITUDE not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressHeightIsNull() {
            addCriterion("ADDRESS_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andAddressHeightIsNotNull() {
            addCriterion("ADDRESS_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andAddressHeightEqualTo(String value) {
            addCriterion("ADDRESS_HEIGHT =", value, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightNotEqualTo(String value) {
            addCriterion("ADDRESS_HEIGHT <>", value, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightGreaterThan(String value) {
            addCriterion("ADDRESS_HEIGHT >", value, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_HEIGHT >=", value, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightLessThan(String value) {
            addCriterion("ADDRESS_HEIGHT <", value, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_HEIGHT <=", value, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightLike(String value) {
            addCriterion("ADDRESS_HEIGHT like", value, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightNotLike(String value) {
            addCriterion("ADDRESS_HEIGHT not like", value, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightIn(List<String> values) {
            addCriterion("ADDRESS_HEIGHT in", values, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightNotIn(List<String> values) {
            addCriterion("ADDRESS_HEIGHT not in", values, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightBetween(String value1, String value2) {
            addCriterion("ADDRESS_HEIGHT between", value1, value2, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andAddressHeightNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_HEIGHT not between", value1, value2, "addressHeight");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("MAC is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("MAC is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("MAC =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("MAC <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("MAC >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("MAC >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("MAC <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("MAC <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("MAC like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("MAC not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("MAC in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("MAC not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("MAC between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("MAC not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andCameraIsNull() {
            addCriterion("CAMERA is null");
            return (Criteria) this;
        }

        public Criteria andCameraIsNotNull() {
            addCriterion("CAMERA is not null");
            return (Criteria) this;
        }

        public Criteria andCameraEqualTo(Integer value) {
            addCriterion("CAMERA =", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotEqualTo(Integer value) {
            addCriterion("CAMERA <>", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraGreaterThan(Integer value) {
            addCriterion("CAMERA >", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAMERA >=", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraLessThan(Integer value) {
            addCriterion("CAMERA <", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraLessThanOrEqualTo(Integer value) {
            addCriterion("CAMERA <=", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraIn(List<Integer> values) {
            addCriterion("CAMERA in", values, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotIn(List<Integer> values) {
            addCriterion("CAMERA not in", values, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraBetween(Integer value1, Integer value2) {
            addCriterion("CAMERA between", value1, value2, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotBetween(Integer value1, Integer value2) {
            addCriterion("CAMERA not between", value1, value2, "camera");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIsNull() {
            addCriterion("DEVICE_IP is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIsNotNull() {
            addCriterion("DEVICE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpEqualTo(String value) {
            addCriterion("DEVICE_IP =", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotEqualTo(String value) {
            addCriterion("DEVICE_IP <>", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpGreaterThan(String value) {
            addCriterion("DEVICE_IP >", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP >=", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLessThan(String value) {
            addCriterion("DEVICE_IP <", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP <=", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLike(String value) {
            addCriterion("DEVICE_IP like", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotLike(String value) {
            addCriterion("DEVICE_IP not like", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIn(List<String> values) {
            addCriterion("DEVICE_IP in", values, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotIn(List<String> values) {
            addCriterion("DEVICE_IP not in", values, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpBetween(String value1, String value2) {
            addCriterion("DEVICE_IP between", value1, value2, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotBetween(String value1, String value2) {
            addCriterion("DEVICE_IP not between", value1, value2, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("CONTACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("CONTACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("CONTACT_NAME =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("CONTACT_NAME <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("CONTACT_NAME >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("CONTACT_NAME <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("CONTACT_NAME like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("CONTACT_NAME not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("CONTACT_NAME in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("CONTACT_NAME not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("CONTACT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("CONTACT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("CONTACT_PHONE =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("CONTACT_PHONE <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("CONTACT_PHONE >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("CONTACT_PHONE <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("CONTACT_PHONE like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("CONTACT_PHONE not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("CONTACT_PHONE in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("CONTACT_PHONE not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME not between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andFirmNameIsNull() {
            addCriterion("FIRM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirmNameIsNotNull() {
            addCriterion("FIRM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirmNameEqualTo(String value) {
            addCriterion("FIRM_NAME =", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameNotEqualTo(String value) {
            addCriterion("FIRM_NAME <>", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameGreaterThan(String value) {
            addCriterion("FIRM_NAME >", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRM_NAME >=", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameLessThan(String value) {
            addCriterion("FIRM_NAME <", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameLessThanOrEqualTo(String value) {
            addCriterion("FIRM_NAME <=", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameLike(String value) {
            addCriterion("FIRM_NAME like", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameNotLike(String value) {
            addCriterion("FIRM_NAME not like", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameIn(List<String> values) {
            addCriterion("FIRM_NAME in", values, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameNotIn(List<String> values) {
            addCriterion("FIRM_NAME not in", values, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameBetween(String value1, String value2) {
            addCriterion("FIRM_NAME between", value1, value2, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameNotBetween(String value1, String value2) {
            addCriterion("FIRM_NAME not between", value1, value2, "firmName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLastModifyByIsNull() {
            addCriterion("LAST_MODIFY_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyByIsNotNull() {
            addCriterion("LAST_MODIFY_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyByEqualTo(String value) {
            addCriterion("LAST_MODIFY_BY =", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByNotEqualTo(String value) {
            addCriterion("LAST_MODIFY_BY <>", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByGreaterThan(String value) {
            addCriterion("LAST_MODIFY_BY >", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFY_BY >=", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByLessThan(String value) {
            addCriterion("LAST_MODIFY_BY <", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFY_BY <=", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByLike(String value) {
            addCriterion("LAST_MODIFY_BY like", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByNotLike(String value) {
            addCriterion("LAST_MODIFY_BY not like", value, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByIn(List<String> values) {
            addCriterion("LAST_MODIFY_BY in", values, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByNotIn(List<String> values) {
            addCriterion("LAST_MODIFY_BY not in", values, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByBetween(String value1, String value2) {
            addCriterion("LAST_MODIFY_BY between", value1, value2, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyByNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFY_BY not between", value1, value2, "lastModifyBy");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNull() {
            addCriterion("LAST_MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("LAST_MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_DATE >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(Date value) {
            addCriterion("LAST_MODIFY_DATE <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE not between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}