package org.yage.tutorial;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yage.tutorial.entity.User;
import org.yage.tutorial.service.UserService;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootTest
class TutorialApplicationTests {

    @Resource
    private UserService userService;


    /**
     * QueryWrapper基础用法
     */
    @Test
    public void testWrapper() {
        // select name from user where age > 20 and (name = 'Tom' or name = 'Sandy');
        // getOne 必须确保sql的结果集只有一行,否则会报错
        // func 可以传入一个条件,为true才会拼接sql(简化了xml的条件拼接)
        boolean notBillie = false;
        User one = userService.getOne(new LambdaQueryWrapper<User>()
                .select(User::getName)
                .gt(User::getAge, 20)
                .and(wrapper -> wrapper.eq(User::getName, "Tom")
                        .or()
                        .eq(User::getName, "Sandy"))
                .func(notBillie, wrapper ->
                        wrapper.ne(User::getName, "Billie"))
                .last("limit 1"));
        log.info("user:{}", one);
    }

    /**
     * in order
     */
    @Test
    public void testIn() {
        List<String> names = Arrays.asList("Jone", "Tom");
        List<User> users = userService.list(new LambdaQueryWrapper<User>()
                // 某些api 可以条件拼接
                .in(names.size() > 0, User::getName, names)
                // 是否排序,是否升序,哪个字段(可变参数,可以是多个参数)
                .orderBy(true, true, User::getAge));
        log.info("users: {}", users);
    }

    @Test
    public void testJoin() {

    }
}
