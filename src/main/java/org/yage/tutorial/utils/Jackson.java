package org.yage.tutorial.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author: Yage
 * @create: 2023-04-18 19:00
 */
public class Jackson {
    public static ThreadLocal<ObjectMapper> OBJECT_MAPPER_THREADLOCAL = ThreadLocal.withInitial(() -> {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        return objectMapper;
    });

    public static ObjectMapper getMapper() {
        return OBJECT_MAPPER_THREADLOCAL.get();
    }
}
