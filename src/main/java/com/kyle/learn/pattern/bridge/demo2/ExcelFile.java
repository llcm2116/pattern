package com.kyle.learn.pattern.bridge.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-26:18:42
 */
public class ExcelFile implements FileType {
    @Override
    public void show() {
        System.out.println("xlsx");
    }
}
