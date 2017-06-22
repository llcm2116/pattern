package com.kyle.learn.pattern.builder.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:10:43
 */
public class Actor {
    private String type;
    private String sex;
    private String face;
    private String costume;
    private String hairstyle;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public String toString() {
        return "英雄名称：[" + type + "]" + "\n性别：[" + sex + "]" + "\n面目：[" + face + "]" + "\n发型：[" + hairstyle + "]" + "\n装备：[" + costume + "]";
    }
}
