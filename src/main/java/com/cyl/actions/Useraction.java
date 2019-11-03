package com.cyl.actions;

import com.cyl.entity.User;
import com.cyl.service.Userservice;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Retention;
import java.util.List;

/**
 * 注解方式设置
 */
public class Useraction {
    @Autowired
    private Userservice userservice;

    public String findone(){
        User u=null;
        u= userservice.finduserbyid(1);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("aa",u);
        System.out.println("---lazy---");
        u.getCosers();
        return "sc";
    }

    public String findall(){
        List u= userservice.findall();
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("aa",u);
        return "sc";
    }

    public String delone(){
        userservice.delone(54);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("aa","删除成功了");
        return  "sc";
    }

    public String updateone(){
        int up= userservice.updateone(90);
        System.out.println(up);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("aa","更新成功了");
        return "sc";
    }

    public String addone(){
        userservice.addone("新增","123");
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("aa","插入成功了");
        return "sc";
    }

    public String insertuser(){
        userservice.insertuser("fuhao","laia");
        return "sc";
    }
}
