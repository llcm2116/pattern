package com.kyle.learn.pattern.prototype.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: kyle
 * Date: 2017-06-19:16:32
 */
public class ShallowLog implements  Cloneable{

    private String name;

    private Attachment attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    protected Object clone() {

        ShallowLog log = null;

        try {
            log = (ShallowLog) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
        }

        return log;
    }
}
