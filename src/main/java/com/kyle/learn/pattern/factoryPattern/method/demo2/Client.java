package com.kyle.learn.pattern.factoryPattern.method.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-17:17:41
 */
public class Client {
    public static void main(String args[]){
        LoggerFactory lf = new DatabaseLoggerFactory();
        lf.writeLog();
    }
}
