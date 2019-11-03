package com.cyl.actions;

import com.cyl.entity.Coser;
import com.cyl.service.Coserservice;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * xml方式设置
 */
public class Coseraction {
    @Autowired
    private Coserservice coserservice;
    public String findall(){
        List<Coser> cosers= coserservice.findall();
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("aa",cosers);
        return "sc";
    }

    public String findone(){
        Coser coser=coserservice.findone(3);
        System.out.println(coser);
        System.out.println("find-lazy");
        System.out.println(coser.getUser());
        return "sc";
    }
}
