package org.yage.tutorial.entity.enumerate;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @author: Yage
 * @create: 2023-04-18 19:22
 */
@Getter
public enum DeviceType {
    ANDROID(1, "android"),
    PC(2, "pc"),
    MAC(5, "mac"),
    ;
    private final int type;
    @EnumValue
    private final String value;

    DeviceType(int type, String value) {
        this.type = type;
        this.value = value;
    }
}
