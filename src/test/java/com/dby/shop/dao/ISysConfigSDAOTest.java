package com.dby.shop.dao;

import com.dby.shop.DbyApplicationTests;
import com.dby.shop.config.Constants;
import com.dby.shop.entity.SysConfig;
import com.dby.shop.entity.SysConfigExample;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-13 下午12:40
 */
public class ISysConfigSDAOTest extends DbyApplicationTests{

    @Autowired
    private ISysConfigSDAO sysConfigSDAO;
    private static Logger logger = LoggerFactory.getLogger(ISysConfigSDAOTest.class);

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
    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    public void selectByExample() throws Exception {
        SysConfigExample sysConfigExample = new SysConfigExample();
        SysConfigExample.Criteria criteria = sysConfigExample.createCriteria()
                .andPrptyEqualTo("appid").andStatusEqualTo(Constants.AVAILABLE_DATA);

        SysConfigExample.Criteria criteria1 = sysConfigExample.createCriteria()
                .andPrptyEqualTo("secret").andStatusEqualTo(Constants.AVAILABLE_DATA);

        sysConfigExample.or(criteria1);

        List<SysConfig> sysConfigs = sysConfigSDAO.selectByExample(sysConfigExample);
        logger.debug("{}", sysConfigs);
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