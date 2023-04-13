package org.yage.tutorial.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.yage.tutorial.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
