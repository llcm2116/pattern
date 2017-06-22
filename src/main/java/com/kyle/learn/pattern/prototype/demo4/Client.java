package com.kyle.learn.pattern.prototype.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-19:17:01
 */
public class Client {

    public static void main(String[] args){
        PrototypeManager instance = PrototypeManager.getInstance();

        instance.getPrototype("bussiness1").doBussiness();
        instance.getPrototype("bussiness2").doBussiness();

        instance.setPrototype("bussiness3",new Bussiness3());
        instance.setPrototype("bussiness4",new Bussiness4());

        instance.getPrototype("bussiness3").doBussiness();
        instance.getPrototype("bussiness4").doBussiness();
    }
}
