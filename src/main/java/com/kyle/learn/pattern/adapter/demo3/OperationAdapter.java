package com.kyle.learn.pattern.adapter.demo3;


/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:15:28
 */
public class OperationAdapter implements Operation1 ,Operation2 {
    private Operation1 operation1;
    private Operation2 operation2;

    public OperationAdapter(){
        operation1 = new Bussiness1();
        operation2 = new Bussiness2();
    }

    @Override
    public void doBussiness1() {
        operation2.doBussiness2();
    }

    @Override
    public void doBussiness2() {
       operation1.doBussiness1();
    }
}
