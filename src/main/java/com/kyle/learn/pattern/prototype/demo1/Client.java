package com.kyle.learn.pattern.prototype.demo1;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:18:46
 */
public class Client {
    public static void main(String[] args) {
        WeekLog log = new WeekLog();
        log.setName("胡本强");
        log.setDate(new Date());
        log.setContent("本周啥都没干");
        System.out.println(log.toString());

        WeekLog cloneLog = log.clone();
        if (cloneLog != null) {
            cloneLog.setName("胡永强");
            cloneLog.setDate(new Date());
            cloneLog.setContent("本周我被政府和谐了");
            System.out.println(cloneLog.toString());
        }

        WeekLog cl = log.clone();

        if (cl != null) {
            //此处是浅复制
            System.out.println(log.getName() == cl.getName());
            System.out.println(log.getContent() == cl.getContent());
            System.out.println(log.getDate() == cl.getDate());
        }
    }
}
