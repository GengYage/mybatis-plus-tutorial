package org.yage.tutorial.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yage.tutorial.entity.Device;
import org.yage.tutorial.mapper.DeviceMapper;
import org.yage.tutorial.service.DeviceService;

@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device> implements DeviceService {
}
