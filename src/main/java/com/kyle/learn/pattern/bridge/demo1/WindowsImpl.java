package com.kyle.learn.pattern.bridge.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-26:18:26
 */
public class WindowsImpl implements ImageImpl {
    @Override
    public void show() {
        System.out.println("在windows下显示");
    }
}
