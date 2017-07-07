package com.kyle.learn.pattern.decorator.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:14:00
 */
public class Client {

    public static void main(String[] args){
        Encrypt base = new Base();

        Encrypt encrypt = new Model(base);
        Encrypt encrypt1 = new Reverse(encrypt);
        Encrypt encrypt2 = new Shift(encrypt1);

        encrypt2.encrypt();
    }
}
