package org.yage.tutorial.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yage.tutorial.entity.Device;
import org.yage.tutorial.entity.User;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<Device> getUserDevice(@Param(Constants.WRAPPER) Wrapper<Object> wrapper);
}
