package com.cyl.dao;

import com.cyl.entity.Coser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CoserDao {

    public List<Coser> findall();

    public Coser findbyid( Integer id);
    @Select("select * from coser where uid=#{uid}")
    public Coser findbyuid(@Param("uid") Integer uid);
}
