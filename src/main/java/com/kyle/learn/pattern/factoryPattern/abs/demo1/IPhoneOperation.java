package com.kyle.learn.pattern.factoryPattern.abs.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:40
 */
public class IPhoneOperation implements Operation {
    @Override
    public void operation() {
        System.out.println("IPhone操作相当舒服");
    }
}
