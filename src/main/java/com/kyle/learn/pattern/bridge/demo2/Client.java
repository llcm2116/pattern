package com.kyle.learn.pattern.bridge.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-26:18:46
 */
public class Client {
    public static void main(String[] args){
        DB db = new MysqlDB();
        FileType type = new ExcelFile();
        db.setFileType(type);

        db.export();
    }
}
