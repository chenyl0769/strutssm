package com.cyl.dao;

import com.cyl.entity.Coser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CoserDao {
    //xml方式查找所有coser
    public List<Coser> findall();
    //xml方式根据ID查找coser
    public Coser findbyid( Integer id);
    //注解方式根据uid查找coser
    @Select("select * from coser where uid=#{uid}")
    public Coser findbyuid(@Param("uid") Integer uid);
}
