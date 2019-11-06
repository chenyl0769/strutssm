package com.cyl.service;

import com.cyl.dao.UserDao;
import com.cyl.entity.User;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public class UserserviceImp implements Userservice {
    @Autowired
    private RabbitTemplate amqpTemplate;
    private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public User finduserbyid(Integer id) {
        return userDao.finduserbyid(id);
    }

    @Override
    public List<User> findall() {
        return userDao.findAll();
    }

    @Override
    public void delone(int id) {
        userDao.delbyid(id);
    }

    @Override
    public int updateone(int id) {
        User user = userDao.finduserbyid(id);
        user.setName("更新了");
        return userDao.updateuser(user);
    }

    @Override
    public void addone(String name, String pwd) {
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        userDao.addone(user);
    }

    @Override
    public void insertuser(String name, String pwd) {
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        userDao.insertuser(user);
    }

    @Override
    public void qmtest() {

        amqpTemplate.convertAndSend("topexchange","ok.jj","aaa");
        System.out.println("发送了");
    }


}
