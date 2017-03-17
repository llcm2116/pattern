package com.kyle.learn.pattern.singleton;

/**
 * 1. 懒汉模式实现了延迟加载，减少资源消耗
 * 2. 由于实例化对象可能出现延迟，需要对实例化代码加线程锁并且做双重判断
 * 3. 保证线程安全，双重判断造成，高并发情况下容易出现性能问题
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-09:18:19
 */
public class LazyModel {
    private static LazyModel instance = null;

    private LazyModel() {

    }

    public static LazyModel getInstance() {
        if (instance == null) {
            synchronized (LazyModel.class) {
                if (instance == null) {
                    instance = new LazyModel();
                }
            }
        }
        return instance;
    }
}