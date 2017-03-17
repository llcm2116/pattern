package com.kyle.learn.pattern.factoryPattern.method.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-17:17:35
 */
public class FileLog implements Logger {

    public FileLog(){
        System.out.println("初始化文件日志工具");
    }

    @Override
    public void writeLog() {
        System.out.print("写日志到文件");
    }
}
