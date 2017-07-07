package com.kyle.learn.pattern.decorator.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:13:55
 */
public class Shift extends EncryptDecorator {
    public Shift(Encrypt encrypt) {
        super(encrypt);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        shift();
    }

    public void shift() {
        System.out.println("进行移位加密");
    }
}
