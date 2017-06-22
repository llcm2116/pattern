package com.kyle.learn.pattern.prototype.demo2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-29:10:59
 */
public class WeekLog implements Serializable {

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

    public WeekLog deepClone() {
        //将对象写入流中
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            //将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (WeekLog) ois.readObject();
        } catch (Exception e) {

        }
        return null;
    }

    public String toString() {
        return "姓名:" + name + ",时间：" + new SimpleDateFormat("yyyy-MM-dd").format(date) + ",内容：" + content;
    }
}
