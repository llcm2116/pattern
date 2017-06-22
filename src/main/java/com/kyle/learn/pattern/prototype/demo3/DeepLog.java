package com.kyle.learn.pattern.prototype.demo3;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: kyle
 * Date: 2017-06-19:16:24
 */
public class DeepLog implements  Cloneable,Serializable {
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
        DeepLog log = null;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            log = (DeepLog) ois.readObject();

        }catch(Exception e){
            e.printStackTrace();
        }

        return log;
    }
}
