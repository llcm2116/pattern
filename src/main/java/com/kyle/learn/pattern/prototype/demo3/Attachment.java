package com.kyle.learn.pattern.prototype.demo3;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: kyle
 * Date: 2017-06-19:16:25
 */
public class Attachment implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println(this.getName());
    }
}
