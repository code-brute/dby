package com.dby.shop.dao;

import com.dby.shop.entity.DeviceHardware;
import com.dby.shop.entity.DeviceHardwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeviceHardwareSDAO {
    long countByExample(DeviceHardwareExample example);

    int deleteByExample(DeviceHardwareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceHardware record);

    int insertSelective(DeviceHardware record);

    List<DeviceHardware> selectByExample(DeviceHardwareExample example);

    DeviceHardware selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceHardware record, @Param("example") DeviceHardwareExample example);

    int updateByExample(@Param("record") DeviceHardware record, @Param("example") DeviceHardwareExample example);

    int updateByPrimaryKeySelective(DeviceHardware record);

    int updateByPrimaryKey(DeviceHardware record);
}