package com.kyle.learn.pattern.bridge.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-26:18:45
 */
public class MysqlDB extends DB {
    @Override
    public void export() {
        System.out.println("mysql导出数据，格式为:");

        fileType.show();
    }
}
