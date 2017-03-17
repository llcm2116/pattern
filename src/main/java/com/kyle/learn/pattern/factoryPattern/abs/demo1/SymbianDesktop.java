package com.kyle.learn.pattern.factoryPattern.abs.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:42
 */
public class SymbianDesktop implements  Desktop {

    @Override
    public void show() {
        System.out.println("塞班系统界面展示很差");
    }
}
