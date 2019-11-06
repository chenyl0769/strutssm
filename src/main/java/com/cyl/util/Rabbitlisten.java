package com.cyl.util;

/**
 * rabbitmq消息接收
 */
public class Rabbitlisten {
    /**
     * 接收并输出消息
     * @param msg
     */
    public void oklisten(String msg){
        System.out.println("收到了: "+msg);
    }
}
