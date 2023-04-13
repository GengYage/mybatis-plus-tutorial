package org.yage.tutorial.ddl;

import com.baomidou.mybatisplus.extension.ddl.SimpleDdl;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MysqlDDL extends SimpleDdl {

    /**
     * 初始化sql
     *
     * @return List
     */
    @Override
    public List<String> getSqlFiles() {
        return Arrays.asList(
                // 内置包方式
                "db/schema.sql",
                "db/data.sql"
        );
    }
}
