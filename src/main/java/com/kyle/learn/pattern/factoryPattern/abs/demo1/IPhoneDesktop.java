package com.kyle.learn.pattern.factoryPattern.abs.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:44
 */
public class IPhoneDesktop implements  Desktop {

    @Override
    public void show() {
        System.out.println("IPhone系统界面相当漂亮");
    }
}
