package com.kyle.learn.pattern.factory.method.demo4;


/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-03-17:16:03
 */
public class FileLogger implements Logger {
    public FileLogger() {
        System.out.println("初始化文件日志工具");
    }

    public void writeLog() {
        System.out.println("写日志到文件");
    }
}
