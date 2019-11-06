package com.cyl.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * Coser实体类
 */
public class Coser implements Serializable {

    private Integer id;

    private Integer uid;

    private String cname;
    private String cstr;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCstr() {
        return cstr;
    }

    public void setCstr(String cstr) {
        this.cstr = cstr;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    @Override
    public String toString() {
        return "Coser{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", cstr='" + cstr + '\'' +
                '}';
    }
}
