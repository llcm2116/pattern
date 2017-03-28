package com.kyle.learn.pattern.singleton.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:16:55
 */
public class Singleton {
    private Singleton() {
    }

    private static class Inner {
        private static final Singleton instance = new Singleton();
    }

    public Singleton getInstance() {
        return Inner.instance;
    }
}
