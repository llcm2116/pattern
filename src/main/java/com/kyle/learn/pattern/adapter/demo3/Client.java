package com.kyle.learn.pattern.adapter.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:15:34
 */
public class Client {

    public static void main(String[] args){
        Operation1 adapter1 = new OperationAdapter();
        Operation2 adapter2 = new OperationAdapter();

        adapter1.doBussiness1();
        adapter2.doBussiness2();
    }
}
