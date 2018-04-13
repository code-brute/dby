package com.dby.shop;

import com.dby.shop.dao.ISysConfigSDAO;
import com.dby.shop.entity.SysConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static com.dby.shop.config.Constants.AVAILABLE_DATA;
import static com.dby.shop.utils.common.DateUtil.dateNow;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbyApplicationTests {

	@Autowired
	private ISysConfigSDAO sysConfigSDAO;

	@Test
	public void contextLoads() {
		String appid = "";
		String secret = "";
		String jsCode = "";

		SysConfig sysConfig = new SysConfig();
		sysConfig.setPrpty("appid");
		sysConfig.setPrptyValue(appid);
		sysConfig.setPrptyName("小程序唯一标识");
		sysConfig.setStatus(AVAILABLE_DATA);
		sysConfig.setCreateDate(dateNow());
		sysConfig.setCreateBy("jackson");
		sysConfig.setLastModifyBy("jackson");
		sysConfig.setLastModifyDate(dateNow());
		sysConfigSDAO.insert(sysConfig);
	}

}
