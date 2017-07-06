package com.kyle.learn.pattern.adapter.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:15:32
 */
public class Bussiness1 implements  Operation1 {

    @Override
    public void doBussiness1() {
        System.out.println("执行任务1");
    }
}
