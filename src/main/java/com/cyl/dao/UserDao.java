package com.cyl.dao;

import com.cyl.entity.User;
import com.cyl.util.SqlFactory;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 注解方式的mybatis
 */
public interface UserDao {
    //动态sql方式查询
    @InsertProvider(type = SqlFactory.class,method ="insertUser")
    public void insertuser(@Param("u") User user);
    //通过角色id查找
    @Select("select * from stu where id = #{id}")
    @Results({@Result(id = true,property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "pwd",column = "pwd"),
            @Result(property = "cosers",column = "id",javaType = List.class,
            many = @Many(select = "com.cyl.dao.CoserDao.findbyuid",fetchType = FetchType.LAZY))
    })
    public User finduserbyid(@Param("id") Integer id);
    //查找所有用户
    @Select("select * from stu")
    public List<User> findAll();
    //删除用户
    @Delete("delete from stu where id=#{id}")
    public void delbyid(@Param("id") Integer id);
    //更新用户
    @Update("update stu set name=#{user.name} where id= #{user.id}")
    int updateuser(@Param("user") User user);
    //增加薪用户
    @Insert("insert into stu (name,pwd) values (#{user.name},#{user.pwd})")
    void addone(@Param("user") User user);
    @Select("select * from stu where id = #{id}")
    public User findid(@Param("id") Integer id);


}
