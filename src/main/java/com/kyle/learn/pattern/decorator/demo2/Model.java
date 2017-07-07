package com.kyle.learn.pattern.decorator.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:13:56
 */
public class Model extends EncryptDecorator {
    public Model(Encrypt encrypt) {
        super(encrypt);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        model();
    }

    public void model() {
        System.out.println("进行球模加密");
    }
}
