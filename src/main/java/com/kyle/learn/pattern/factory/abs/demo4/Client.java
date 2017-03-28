package com.kyle.learn.pattern.factory.abs.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:10:42
 */
public class Client {

    public static void main(String[] args) throws Exception {
        String companyClass = com.kyle.learn.pattern.factory.abs.demo4.XMLUtil.getBeans("hw");
        ElectronicCompanyFactory ecf = (ElectronicCompanyFactory) Class.forName(companyClass).newInstance();
        ecf.createTV().show();
        ecf.createMobile().call();
    }
}
