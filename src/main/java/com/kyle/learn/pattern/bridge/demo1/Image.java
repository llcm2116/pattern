package com.kyle.learn.pattern.bridge.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-26:18:24
 */
public abstract class Image {
    protected ImageImpl impl;

    public void setImpl(ImageImpl impl) {
        this.impl = impl;
    }

    public abstract void parseFile();
}
