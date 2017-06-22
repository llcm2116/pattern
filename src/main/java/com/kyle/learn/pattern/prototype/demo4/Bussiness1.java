package com.kyle.learn.pattern.prototype.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-19:16:54
 */
public class Bussiness1 implements  Prototype {

    @Override
    public Object clone() {

        Bussiness1 object = null;
        try {
            object = (Bussiness1) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆");
        }

        return object;
    }

    @Override
    public void doBussiness() {
        System.out.println("执行业务1");
    }
}
