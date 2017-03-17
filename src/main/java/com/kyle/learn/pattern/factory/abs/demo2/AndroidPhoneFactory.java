package com.kyle.learn.pattern.factory.abs.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:48
 */
public class AndroidPhoneFactory implements PhoneFactory {

    @Override
    public Operation createOperation() {
        return new AndroidOperation();
    }

    @Override
    public Desktop createDesktop() {
        return new AndroidDesktop();
    }
}
