package com.kyle.learn.pattern.factory.abs.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:47
 */
public class SymbianPhoneFactory implements PhoneFactory {

    @Override
    public Operation createOperation() {
        return new SymbianOperation();
    }

    @Override
    public Desktop createDesktop() {
        return new SymbianDesktop();
    }
}
