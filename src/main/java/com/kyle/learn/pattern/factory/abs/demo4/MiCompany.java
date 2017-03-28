package com.kyle.learn.pattern.factory.abs.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:10:31
 */
public class MiCompany implements ElectronicCompanyFactory {

    @Override
    public TV createTV() {
        return new MiTV();
    }

    @Override
    public Mobile createMobile() {
        return new MiMobile();
    }
}
