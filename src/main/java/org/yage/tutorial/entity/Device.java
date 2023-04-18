package org.yage.tutorial.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.yage.tutorial.entity.enumerate.DeviceType;

import java.time.LocalDateTime;

@Data
@TableName("device")
public class Device {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    private Long owner;
    private String sn;
    // 支持枚举
    private DeviceType type;
    // 自动填充
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
