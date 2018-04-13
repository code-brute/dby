package com.dby.shop.dao;

import com.dby.shop.DbyApplicationTests;
import com.dby.shop.entity.AppConfigExample;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-13 下午12:38
 */
public class IAppConfigSDAOTest extends DbyApplicationTests{


    @Autowired
    private IAppConfigSDAO appConfigSDAO;
    private static Logger logger = LoggerFactory.getLogger(IAppConfigSDAOTest.class);


    @Test
    public void countByExample() throws Exception {
    }

    @Test
    public void deleteByExample() throws Exception {
        AppConfigExample appConfigExample = new AppConfigExample();
        appConfigExample.createCriteria().andOpenIdEqualTo("o4_Vn5NqzJlXVvQhD2wL6mMb0Lzc").andLastModifyByEqualTo("岑夫子");
        appConfigSDAO.deleteByExample(appConfigExample);
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