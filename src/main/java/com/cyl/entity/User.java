package com.cyl.entity;

import javax.naming.Name;
import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private Integer id;
    private String name;
    private String pwd;
    private List<Coser> cosers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public List<Coser> getCosers() {
        return cosers;
    }

    public void setCosers(List<Coser> cosers) {
        this.cosers = cosers;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
