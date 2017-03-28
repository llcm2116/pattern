package com.kyle.learn.pattern.factory.abs.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:10:42
 */
public class Client {

    public static void main(String[] args) {
        ElectronicCompanyFactory ecf = new HuaWeiCompany();
        ecf.createTV().show();
        ecf.createMobile().call();
    }
}
