package com.dby.shop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andCompanyMailIsNull() {
            addCriterion("COMPANY_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMailIsNotNull() {
            addCriterion("COMPANY_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMailEqualTo(String value) {
            addCriterion("COMPANY_MAIL =", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotEqualTo(String value) {
            addCriterion("COMPANY_MAIL <>", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailGreaterThan(String value) {
            addCriterion("COMPANY_MAIL >", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_MAIL >=", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailLessThan(String value) {
            addCriterion("COMPANY_MAIL <", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_MAIL <=", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailLike(String value) {
            addCriterion("COMPANY_MAIL like", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotLike(String value) {
            addCriterion("COMPANY_MAIL not like", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailIn(List<String> values) {
            addCriterion("COMPANY_MAIL in", values, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotIn(List<String> values) {
            addCriterion("COMPANY_MAIL not in", values, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailBetween(String value1, String value2) {
            addCriterion("COMPANY_MAIL between", value1, value2, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotBetween(String value1, String value2) {
            addCriterion("COMPANY_MAIL not between", value1, value2, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("COMPANY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("COMPANY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("COMPANY_ADDRESS >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("COMPANY_ADDRESS <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("COMPANY_ADDRESS like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("COMPANY_ADDRESS not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("COMPANY_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("COMPANY_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("COMPANY_PHONE =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("COMPANY_PHONE <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("COMPANY_PHONE >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_PHONE >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("COMPANY_PHONE <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_PHONE <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("COMPANY_PHONE like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("COMPANY_PHONE not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("COMPANY_PHONE in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("COMPANY_PHONE not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("COMPANY_PHONE between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("COMPANY_PHONE not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(Integer value) {
            addCriterion("INDUSTRY =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(Integer value) {
            addCriterion("INDUSTRY <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(Integer value) {
            addCriterion("INDUSTRY >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("INDUSTRY >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(Integer value) {
            addCriterion("INDUSTRY <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("INDUSTRY <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<Integer> values) {
            addCriterion("INDUSTRY in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<Integer> values) {
            addCriterion("INDUSTRY not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(Integer value1, Integer value2) {
            addCriterion("INDUSTRY between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("INDUSTRY not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNull() {
            addCriterion("CONTACT_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNotNull() {
            addCriterion("CONTACT_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andContactMailEqualTo(String value) {
            addCriterion("CONTACT_MAIL =", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotEqualTo(String value) {
            addCriterion("CONTACT_MAIL <>", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThan(String value) {
            addCriterion("CONTACT_MAIL >", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_MAIL >=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThan(String value) {
            addCriterion("CONTACT_MAIL <", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_MAIL <=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLike(String value) {
            addCriterion("CONTACT_MAIL like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotLike(String value) {
            addCriterion("CONTACT_MAIL not like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailIn(List<String> values) {
            addCriterion("CONTACT_MAIL in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotIn(List<String> values) {
            addCriterion("CONTACT_MAIL not in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailBetween(String value1, String value2) {
            addCriterion("CONTACT_MAIL between", value1, value2, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotBetween(String value1, String value2) {
            addCriterion("CONTACT_MAIL not between", value1, value2, "contactMail");
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

        public Criteria andStoreNameIsNull() {
            addCriterion("STORE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("STORE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("STORE_NAME =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("STORE_NAME <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("STORE_NAME >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_NAME >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("STORE_NAME <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("STORE_NAME <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("STORE_NAME like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("STORE_NAME not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("STORE_NAME in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("STORE_NAME not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("STORE_NAME between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("STORE_NAME not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStorePhotoIsNull() {
            addCriterion("STORE_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andStorePhotoIsNotNull() {
            addCriterion("STORE_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andStorePhotoEqualTo(String value) {
            addCriterion("STORE_PHOTO =", value, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoNotEqualTo(String value) {
            addCriterion("STORE_PHOTO <>", value, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoGreaterThan(String value) {
            addCriterion("STORE_PHOTO >", value, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_PHOTO >=", value, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoLessThan(String value) {
            addCriterion("STORE_PHOTO <", value, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoLessThanOrEqualTo(String value) {
            addCriterion("STORE_PHOTO <=", value, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoLike(String value) {
            addCriterion("STORE_PHOTO like", value, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoNotLike(String value) {
            addCriterion("STORE_PHOTO not like", value, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoIn(List<String> values) {
            addCriterion("STORE_PHOTO in", values, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoNotIn(List<String> values) {
            addCriterion("STORE_PHOTO not in", values, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoBetween(String value1, String value2) {
            addCriterion("STORE_PHOTO between", value1, value2, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhotoNotBetween(String value1, String value2) {
            addCriterion("STORE_PHOTO not between", value1, value2, "storePhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoIsNull() {
            addCriterion("CHECKOUT_COUNTER_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoIsNotNull() {
            addCriterion("CHECKOUT_COUNTER_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoEqualTo(String value) {
            addCriterion("CHECKOUT_COUNTER_PHOTO =", value, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoNotEqualTo(String value) {
            addCriterion("CHECKOUT_COUNTER_PHOTO <>", value, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoGreaterThan(String value) {
            addCriterion("CHECKOUT_COUNTER_PHOTO >", value, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKOUT_COUNTER_PHOTO >=", value, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoLessThan(String value) {
            addCriterion("CHECKOUT_COUNTER_PHOTO <", value, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoLessThanOrEqualTo(String value) {
            addCriterion("CHECKOUT_COUNTER_PHOTO <=", value, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoLike(String value) {
            addCriterion("CHECKOUT_COUNTER_PHOTO like", value, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoNotLike(String value) {
            addCriterion("CHECKOUT_COUNTER_PHOTO not like", value, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoIn(List<String> values) {
            addCriterion("CHECKOUT_COUNTER_PHOTO in", values, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoNotIn(List<String> values) {
            addCriterion("CHECKOUT_COUNTER_PHOTO not in", values, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoBetween(String value1, String value2) {
            addCriterion("CHECKOUT_COUNTER_PHOTO between", value1, value2, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckoutCounterPhotoNotBetween(String value1, String value2) {
            addCriterion("CHECKOUT_COUNTER_PHOTO not between", value1, value2, "checkoutCounterPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoIsNull() {
            addCriterion("BUSINESS_LICENSE_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoIsNotNull() {
            addCriterion("BUSINESS_LICENSE_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO =", value, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO <>", value, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO >", value, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO >=", value, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoLessThan(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO <", value, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO <=", value, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoLike(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO like", value, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoNotLike(String value) {
            addCriterion("BUSINESS_LICENSE_PHOTO not like", value, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_PHOTO in", values, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_PHOTO not in", values, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_PHOTO between", value1, value2, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePhotoNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_PHOTO not between", value1, value2, "businessLicensePhoto");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNull() {
            addCriterion("STORE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNotNull() {
            addCriterion("STORE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneEqualTo(String value) {
            addCriterion("STORE_PHONE =", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotEqualTo(String value) {
            addCriterion("STORE_PHONE <>", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThan(String value) {
            addCriterion("STORE_PHONE >", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_PHONE >=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThan(String value) {
            addCriterion("STORE_PHONE <", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThanOrEqualTo(String value) {
            addCriterion("STORE_PHONE <=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLike(String value) {
            addCriterion("STORE_PHONE like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotLike(String value) {
            addCriterion("STORE_PHONE not like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIn(List<String> values) {
            addCriterion("STORE_PHONE in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotIn(List<String> values) {
            addCriterion("STORE_PHONE not in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneBetween(String value1, String value2) {
            addCriterion("STORE_PHONE between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotBetween(String value1, String value2) {
            addCriterion("STORE_PHONE not between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIsNull() {
            addCriterion("BUSINESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIsNotNull() {
            addCriterion("BUSINESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeEqualTo(String value) {
            addCriterion("BUSINESS_TIME =", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotEqualTo(String value) {
            addCriterion("BUSINESS_TIME <>", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeGreaterThan(String value) {
            addCriterion("BUSINESS_TIME >", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TIME >=", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeLessThan(String value) {
            addCriterion("BUSINESS_TIME <", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TIME <=", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeLike(String value) {
            addCriterion("BUSINESS_TIME like", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotLike(String value) {
            addCriterion("BUSINESS_TIME not like", value, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeIn(List<String> values) {
            addCriterion("BUSINESS_TIME in", values, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotIn(List<String> values) {
            addCriterion("BUSINESS_TIME not in", values, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TIME between", value1, value2, "businessTime");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TIME not between", value1, value2, "businessTime");
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

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeIsNull() {
            addCriterion("PWD_SET_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeIsNotNull() {
            addCriterion("PWD_SET_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeEqualTo(Date value) {
            addCriterion("PWD_SET_TIME =", value, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeNotEqualTo(Date value) {
            addCriterion("PWD_SET_TIME <>", value, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeGreaterThan(Date value) {
            addCriterion("PWD_SET_TIME >", value, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PWD_SET_TIME >=", value, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeLessThan(Date value) {
            addCriterion("PWD_SET_TIME <", value, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeLessThanOrEqualTo(Date value) {
            addCriterion("PWD_SET_TIME <=", value, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeIn(List<Date> values) {
            addCriterion("PWD_SET_TIME in", values, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeNotIn(List<Date> values) {
            addCriterion("PWD_SET_TIME not in", values, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeBetween(Date value1, Date value2) {
            addCriterion("PWD_SET_TIME between", value1, value2, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdSetTimeNotBetween(Date value1, Date value2) {
            addCriterion("PWD_SET_TIME not between", value1, value2, "pwdSetTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeIsNull() {
            addCriterion("PWD_INACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeIsNotNull() {
            addCriterion("PWD_INACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeEqualTo(Date value) {
            addCriterion("PWD_INACTIVE_TIME =", value, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeNotEqualTo(Date value) {
            addCriterion("PWD_INACTIVE_TIME <>", value, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeGreaterThan(Date value) {
            addCriterion("PWD_INACTIVE_TIME >", value, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PWD_INACTIVE_TIME >=", value, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeLessThan(Date value) {
            addCriterion("PWD_INACTIVE_TIME <", value, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("PWD_INACTIVE_TIME <=", value, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeIn(List<Date> values) {
            addCriterion("PWD_INACTIVE_TIME in", values, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeNotIn(List<Date> values) {
            addCriterion("PWD_INACTIVE_TIME not in", values, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeBetween(Date value1, Date value2) {
            addCriterion("PWD_INACTIVE_TIME between", value1, value2, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andPwdInactiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("PWD_INACTIVE_TIME not between", value1, value2, "pwdInactiveTime");
            return (Criteria) this;
        }

        public Criteria andLastPwdIsNull() {
            addCriterion("LAST_PWD is null");
            return (Criteria) this;
        }

        public Criteria andLastPwdIsNotNull() {
            addCriterion("LAST_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andLastPwdEqualTo(String value) {
            addCriterion("LAST_PWD =", value, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdNotEqualTo(String value) {
            addCriterion("LAST_PWD <>", value, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdGreaterThan(String value) {
            addCriterion("LAST_PWD >", value, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_PWD >=", value, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdLessThan(String value) {
            addCriterion("LAST_PWD <", value, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdLessThanOrEqualTo(String value) {
            addCriterion("LAST_PWD <=", value, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdLike(String value) {
            addCriterion("LAST_PWD like", value, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdNotLike(String value) {
            addCriterion("LAST_PWD not like", value, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdIn(List<String> values) {
            addCriterion("LAST_PWD in", values, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdNotIn(List<String> values) {
            addCriterion("LAST_PWD not in", values, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdBetween(String value1, String value2) {
            addCriterion("LAST_PWD between", value1, value2, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andLastPwdNotBetween(String value1, String value2) {
            addCriterion("LAST_PWD not between", value1, value2, "lastPwd");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagIsNull() {
            addCriterion("INIT_PWD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagIsNotNull() {
            addCriterion("INIT_PWD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagEqualTo(Integer value) {
            addCriterion("INIT_PWD_FLAG =", value, "initPwdFlag");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagNotEqualTo(Integer value) {
            addCriterion("INIT_PWD_FLAG <>", value, "initPwdFlag");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagGreaterThan(Integer value) {
            addCriterion("INIT_PWD_FLAG >", value, "initPwdFlag");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("INIT_PWD_FLAG >=", value, "initPwdFlag");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagLessThan(Integer value) {
            addCriterion("INIT_PWD_FLAG <", value, "initPwdFlag");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagLessThanOrEqualTo(Integer value) {
            addCriterion("INIT_PWD_FLAG <=", value, "initPwdFlag");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagIn(List<Integer> values) {
            addCriterion("INIT_PWD_FLAG in", values, "initPwdFlag");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagNotIn(List<Integer> values) {
            addCriterion("INIT_PWD_FLAG not in", values, "initPwdFlag");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagBetween(Integer value1, Integer value2) {
            addCriterion("INIT_PWD_FLAG between", value1, value2, "initPwdFlag");
            return (Criteria) this;
        }

        public Criteria andInitPwdFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("INIT_PWD_FLAG not between", value1, value2, "initPwdFlag");
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

        public Criteria andSaltIsNull() {
            addCriterion("SALT is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("SALT is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("SALT =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("SALT <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("SALT >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("SALT >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("SALT <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("SALT <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("SALT like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("SALT not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("SALT in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("SALT not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("SALT between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("SALT not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("OPEN_ID =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("OPEN_ID <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("OPEN_ID >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ID >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("OPEN_ID <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ID <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("OPEN_ID like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("OPEN_ID not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("OPEN_ID in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("OPEN_ID not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("OPEN_ID between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ID not between", value1, value2, "openId");
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