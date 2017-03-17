package com.kyle.learn.pattern.factory.abs.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:49
 */
public class IPhonePhoneFactory implements PhoneFactory {

    @Override
    public Operation createOperation() {
        return new IPhoneOperation();
    }

    @Override
    public Desktop createDesktop() {
        return new IPhoneDesktop();
    }
}
