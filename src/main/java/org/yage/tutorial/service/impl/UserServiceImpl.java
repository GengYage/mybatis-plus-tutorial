package org.yage.tutorial.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yage.tutorial.entity.User;
import org.yage.tutorial.mapper.UserMapper;
import org.yage.tutorial.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
