package com.kyle.learn.pattern.factory.abs.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:44
 */
public class IPhoneDesktop implements Desktop {

    @Override
    public void show() {
        System.out.println("IPhone系统界面相当漂亮");
    }
}
