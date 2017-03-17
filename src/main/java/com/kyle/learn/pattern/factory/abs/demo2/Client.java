package com.kyle.learn.pattern.factory.abs.demo2;

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
