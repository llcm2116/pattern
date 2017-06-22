package com.kyle.learn.pattern.prototype.demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:18:42
 */
public class WeekLog implements Cloneable {
    private String name;
    private Date date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeekLog clone() {
        try {
            WeekLog log = (WeekLog) super.clone();
            return log;
        } catch (CloneNotSupportedException e) {
            System.out.println("Class " + this.getClass().getName() + " not support method clone()");
        }
        return null;
    }

    public String toString() {
        return "姓名:" + name + ",时间：" + new SimpleDateFormat("yyyy-MM-dd").format(date) + ",内容：" + content;
    }
}
