package com.kyle.learn.pattern.prototype.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: kyle
 * Date: 2017-06-19:16:34
 */
public class Client {
    public static  void  main(String[] args){
        ShallowLog log = new ShallowLog();
        Attachment attachment = new Attachment();
        log.setName("日志1");
        attachment.setName("附件1");
        log.setAttachment(attachment);

        ShallowLog newLog = (ShallowLog) log.clone();
        System.out.println(newLog.getName() == log.getName());
        System.out.println(newLog.getAttachment() == log.getAttachment());


        DeepLog deepLog = new DeepLog();
        deepLog.setName("日志2");
        attachment.setName("附件2");
        deepLog.setAttachment(attachment);

        DeepLog newDeepLog = (DeepLog) deepLog.clone();

        System.out.println(deepLog.getName() == newDeepLog.getName());
        System.out.println(deepLog.getAttachment() == newDeepLog.getAttachment());
    }
}
