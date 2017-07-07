package com.kyle.learn.pattern.decorator.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:14:06
 */
public class Base extends  Encrypt {
    @Override
    public void encrypt() {
        System.out.println("基础加密");
    }
}
