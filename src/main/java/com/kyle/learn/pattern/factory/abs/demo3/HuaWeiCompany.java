package com.kyle.learn.pattern.factory.abs.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:10:34
 */
public class HuaWeiCompany implements ElectronicCompanyFactory {
    @Override
    public TV createTV() {
        return new HuaWeiTV();
    }

    @Override
    public Mobile createMobile() {
        return new HuaWeiMobile();
    }
}
