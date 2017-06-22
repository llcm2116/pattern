package com.kyle.learn.pattern.prototype.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-19:16:54
 */
public class Bussiness2 implements  Prototype {

    @Override
    public Object clone() {

        Bussiness2 object = null;
        try {
            object = (Bussiness2) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆");
        }

        return object;
    }

    @Override
    public void doBussiness() {
        System.out.println("执行业务2");
    }
}
