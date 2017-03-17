package com.kyle.learn.pattern.factory.method.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-03-17:16:10
 */
public class DatabaseLogger implements Logger {
    public DatabaseLogger() {
        System.out.println("初始化数据库日志工具");
    }

    public void writeLog() {
        System.out.println("写日志到数据库");
    }
}
