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
		String secret = "23bf305c11fa40a008ce08515dfc9678";
		String jsCode = "";

		SysConfig sysConfig = new SysConfig();
		sysConfig.setPrpty("secret");
		sysConfig.setPrptyValue("23bf305c11fa40a008ce08515dfc9678");
		sysConfig.setPrptyName("小程序的 app secret");
		sysConfig.setStatus(AVAILABLE_DATA);
		sysConfig.setCreateDate(dateNow());
		sysConfig.setCreateBy("jackson");
		sysConfig.setLastModifyBy("jackson");
		sysConfig.setLastModifyDate(dateNow());
		sysConfigSDAO.insert(sysConfig);
	}

}
