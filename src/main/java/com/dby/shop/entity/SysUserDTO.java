package com.dby.shop.entity;

import java.io.Serializable;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-17 下午2:21
 */
public class SysUserDTO extends SysUser implements Serializable {
    private static final long serialVersionUID = 4464606966618433349L;
    
    private String industryDesc;

    public String getIndustryDesc() {
        return industryDesc;
    }

    public void setIndustryDesc(String industryDesc) {
        this.industryDesc = industryDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SysUserDTO)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        SysUserDTO that = (SysUserDTO) o;

        return getIndustryDesc().equals(that.getIndustryDesc());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getIndustryDesc().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SysUserDTO{" +
                "industryDesc='" + industryDesc + '\'' +
                '}';
    }
}
