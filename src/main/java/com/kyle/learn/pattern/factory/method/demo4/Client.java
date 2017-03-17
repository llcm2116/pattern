package com.kyle.learn.pattern.factory.method.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-03-17:16:13
 */
public class Client {
    public static void main(String[] args) throws Exception {
        String beanClass = XMLUtil.getBeans("file");

        LoggerFactory loggerFactory = (LoggerFactory) Class.forName(beanClass).newInstance();
        loggerFactory.writeLog();
    }
}
