package com.cyl.service;

import com.cyl.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface Userservice {

    public User finduserbyid(Integer id);

    public List<User> findall();

    void delone(int id);

    int updateone(int id);

    void addone(String name, String pwd);

    void insertuser(String name, String pwd);
}
