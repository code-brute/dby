package com.dby.shop.dao;

import com.dby.shop.entity.SysConfig;
import com.dby.shop.entity.SysConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ISysConfigSDAO {
    long countByExample(SysConfigExample example);

    int deleteByExample(SysConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExample(SysConfigExample example);

    SysConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}