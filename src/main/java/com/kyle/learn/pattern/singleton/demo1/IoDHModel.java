package com.kyle.learn.pattern.singleton.demo1;

/**
 * 1. 没有在类加载的时候创建对象，防止资源损耗
 * 2. 在调用getInstance方法时加载HoderClass内部类并创建对象，实现延迟加载，创建过程由JVM保证，防止多线程下出现线程不安全问题
 * 3. 不是所有语言都支持此类写法
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-09:18:27
 */
public class IoDHModel {

    private IoDHModel() {
    }

    private static class HoderClass {
        private static final IoDHModel instance = new IoDHModel();
    }

    public static IoDHModel getInstance() {
        return HoderClass.instance;
    }
}
