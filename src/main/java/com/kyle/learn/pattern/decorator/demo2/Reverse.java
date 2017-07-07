package com.kyle.learn.pattern.decorator.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:13:56
 */
public class Reverse extends EncryptDecorator {
    public Reverse(Encrypt encrypt) {
        super(encrypt);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        reverse();
    }

    public void reverse() {
        System.out.println("进行逆向加密");
    }
}
