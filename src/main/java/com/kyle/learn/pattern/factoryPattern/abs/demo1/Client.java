package com.kyle.learn.pattern.factoryPattern.abs.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:50
 */
public class Client {

    public static void main(String[] args){
        PhoneFactory pf = new IPhonePhoneFactory();
        Operation operation = pf.createOperation();
        Desktop desktop = pf.createDesktop();
        operation.operation();
        desktop.show();
    }
}
