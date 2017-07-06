package com.kyle.learn.pattern.composite.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:18:21
 */
public class Department extends Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage() {
        System.out.println("部门 " + name + " 发起通知");
    }
}
