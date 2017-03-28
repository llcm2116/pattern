package com.kyle.learn.pattern.factory.abs.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:10:32
 */
public class MiMobile implements Mobile {
    @Override
    public void call() {
        System.out.println("小米手机打电话发热");
    }
}
