package com.cyl.util;

import com.cyl.entity.User;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class SqlFactory {
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
