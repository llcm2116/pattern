package com.kyle.learn.pattern.adapter.demo5;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:16:28
 */
public class Client {

    public static void main(String[] args){
        OAEntrypt oaEntrypt = new EntryptAdapter();

        oaEntrypt.entrypt();
        oaEntrypt.addData();
    }
}
