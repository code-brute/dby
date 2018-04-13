package com.dby.shop.dao;

import com.dby.shop.DbyApplicationTests;
import com.dby.shop.config.Constants;
import com.dby.shop.entity.SysIndustry;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static com.dby.shop.utils.common.DateUtil.dateNow;
import static org.junit.Assert.*;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-13 下午12:40
 */
public class ISysIndustrySDAOTest extends DbyApplicationTests{

    @Autowired
    private ISysIndustrySDAO sysIndustrySDAO;

    @Test
    public void countByExample() throws Exception {
    }

    @Test
    public void deleteByExample() throws Exception {
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        SysIndustry sysIndustry = new SysIndustry();
        sysIndustry.setName("");
        sysIndustry.setStatus(Constants.AVAILABLE_DATA);
        sysIndustry.setCreateBy("jackson");
        sysIndustry.setCreateDate(dateNow());
        sysIndustry.setLastModifyBy("jackson");
        sysIndustry.setLastModifyDate(dateNow());
        sysIndustrySDAO.insert(sysIndustry);

    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    public void selectByExample() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
    }

    @Test
    public void updateByExampleSelective() throws Exception {
    }

    @Test
    public void updateByExample() throws Exception {
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

}