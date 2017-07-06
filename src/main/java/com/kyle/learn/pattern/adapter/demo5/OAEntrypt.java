package com.kyle.learn.pattern.adapter.demo5;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:16:21
 */
public abstract class OAEntrypt {
    public void addData(){
        System.out.println("数据写入数据库");
    }

    public abstract void entrypt();
}
