package org.yage.tutorial.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.yage.tutorial.entity.Device;

@Mapper
public interface DeviceMapper extends BaseMapper<Device> {
}
