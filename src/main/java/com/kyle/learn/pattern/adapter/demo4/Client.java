package com.kyle.learn.pattern.adapter.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:15:56
 */
public class Client {

    public static  void main (String[] args){
        DemoInterface buss1 = new Bussiness1();
        DemoInterface buss2 = new Bussiness2();

        buss1.method1();
        buss1.method2();

        buss2.method3();
        buss2.method4();
    }

}
