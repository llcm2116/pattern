package com.kyle.learn.pattern.composite.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:17:33
 */
public abstract class AbstractFile {
    public void add(AbstractFile abstractFile) {
        System.out.println("不支持此方法");
    }

    public void remove(AbstractFile abstractFile) {
        System.out.println("不支持此方法");
    }

    public AbstractFile getChild(int i) {
        System.out.println("不支持此方法");
        return null;
    }

    public abstract void deleteVirus();
}
