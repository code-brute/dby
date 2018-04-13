package com.dby.shop.dao;

import com.dby.shop.entity.AppConfig;
import com.dby.shop.entity.AppConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppConfigSDAO {
    long countByExample(AppConfigExample example);

    int deleteByExample(AppConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppConfig record);

    int insertSelective(AppConfig record);

    List<AppConfig> selectByExample(AppConfigExample example);

    AppConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppConfig record, @Param("example") AppConfigExample example);

    int updateByExample(@Param("record") AppConfig record, @Param("example") AppConfigExample example);

    int updateByPrimaryKeySelective(AppConfig record);

    int updateByPrimaryKey(AppConfig record);
}