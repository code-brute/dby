package com.dby.shop.dao;

import com.dby.shop.entity.SysIndustry;
import com.dby.shop.entity.SysIndustryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISysIndustrySDAO {
    long countByExample(SysIndustryExample example);

    int deleteByExample(SysIndustryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysIndustry record);

    int insertSelective(SysIndustry record);

    List<SysIndustry> selectByExample(SysIndustryExample example);

    SysIndustry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysIndustry record, @Param("example") SysIndustryExample example);

    int updateByExample(@Param("record") SysIndustry record, @Param("example") SysIndustryExample example);

    int updateByPrimaryKeySelective(SysIndustry record);

    int updateByPrimaryKey(SysIndustry record);
}