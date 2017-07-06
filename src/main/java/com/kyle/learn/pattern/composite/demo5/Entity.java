package com.kyle.learn.pattern.composite.demo5;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:18:33
 */
public class Entity extends Control {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entity(String name) {
        this.name = name;
    }

    @Override
    public void service() {
        System.out.println("控件" + name + " 开始工作");
    }
}
