package org.yage.tutorial.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("device")
public class Device {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    private String owner;
    private String sn;
}
