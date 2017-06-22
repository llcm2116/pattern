package com.kyle.learn.pattern.prototype.demo2;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-29:11:01
 */
public class Client {
    public static void main(String[] args) {
        WeekLog log = new WeekLog();
        log.setName("胡本强");
        log.setDate(new Date());
        log.setContent("本周啥都没干");
        System.out.println(log.toString());

        WeekLog cloneLog = log.deepClone();
        if (cloneLog != null) {
            cloneLog.setName("胡永强");
            cloneLog.setDate(new Date());
            cloneLog.setContent("本周我被政府和谐了");
            System.out.println(cloneLog.toString());
        }

        WeekLog cl = log.deepClone();

        if (cl != null) {
            //此处是深度复制
            System.out.println(log.getName() == cl.getName());
            System.out.println(log.getContent() == cl.getContent());
            System.out.println(log.getDate() == cl.getDate());
        }
    }
}
