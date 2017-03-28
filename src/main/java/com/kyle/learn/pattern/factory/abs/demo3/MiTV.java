package com.kyle.learn.pattern.factory.abs.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:10:31
 */
public class MiTV implements TV {
    @Override
    public void show() {
        System.out.println("小米电视画面一般般");
    }
}