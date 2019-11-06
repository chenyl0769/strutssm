package com.cyl.util;

import com.cyl.entity.User;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * InsertProvider使用的sql工厂
 */
public class SqlFactory {
    /**
     * 接收User拼接insert语句
     * @param usermap
     * @return
     */
    public String insertUser(Map<String,Object> usermap){

        User user = (User) usermap.get("u");
        SQL sql = new SQL();
        sql.INSERT_INTO("stu");

        if (user.getName()!=null){
            sql.VALUES("name","#{u.name}");
        }
        if (user.getPwd()!=null){
            sql.VALUES("pwd","#{u.pwd}");
        }
        
        return sql.toString();
    }
}
