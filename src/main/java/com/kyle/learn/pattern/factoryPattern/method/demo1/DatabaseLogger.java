package com.kyle.learn.pattern.factoryPattern.method.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-17:17:36
 */
public class DatabaseLogger implements  Logger {

    public DatabaseLogger(){
        System.out.println("初始化数据库日志工具");
    }

    @Override
    public void writeLog() {
        System.out.println("写日志到数据库");
    }
}
