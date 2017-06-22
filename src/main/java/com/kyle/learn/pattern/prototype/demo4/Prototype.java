package com.kyle.learn.pattern.prototype.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-19:16:53
 */
public interface Prototype extends  Cloneable {
    Object clone();

    void doBussiness();
}
