package com.kyle.learn.pattern.adapter.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:14:58
 */
public class Client {

    public static void main(String[] args){
        ScopeOperation operation = new OperationAdapter();

        int[] array = new int[]{11,65,21,89,33,90,42};

        int[] result = operation.sort(array);

        for(int i :result){
            System.out.print(i+",");
        }

        System.out.println(operation.search(array,65)!= -1?"\n查找到数字65":"找不到数字65");

        System.out.println(operation.search(array,615)!= -1?"查找到数字615":"找不到数字615");
    }
}
