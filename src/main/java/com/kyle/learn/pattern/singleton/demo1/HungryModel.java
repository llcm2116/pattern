package com.kyle.learn.pattern.singleton.demo1;

/**
 * 1. 类加载时实例化对象，不会出现线程安全问题，保证了每次都输出同一个实例
 * 2. 在未使用的情况及下实例化对象，资源损耗
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-09:18:24
 */
public class HungryModel {
    private static final HungryModel instance = new HungryModel();

    private HungryModel() {
    }

    public static HungryModel getInstance() {
        return instance;
    }
}
