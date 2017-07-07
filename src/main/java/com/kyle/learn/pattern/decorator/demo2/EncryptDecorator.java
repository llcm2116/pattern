package com.kyle.learn.pattern.decorator.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:13:58
 */
public class EncryptDecorator extends Encrypt {
    private Encrypt encrypt;

    public Encrypt getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public void encrypt() {
        encrypt.encrypt();
    }

    public EncryptDecorator(Encrypt encrypt) {
        this.encrypt = encrypt;
    }
}
