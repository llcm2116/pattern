package com.kyle.learn.pattern.factory.abs.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:43
 */
public class AndroidDesktop implements Desktop {

    @Override
    public void show() {
        System.out.println("Android系统界面一般般");
    }
}
