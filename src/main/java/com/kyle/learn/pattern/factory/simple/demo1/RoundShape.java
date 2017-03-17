package com.kyle.learn.pattern.factory.simple.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-10:18:11
 */
public class RoundShape implements Shape {
    public RoundShape(){
        System.out.println("初始化圆形");
    }

    public void draw() {
        System.out.println("绘制圆形");
    }

    public void erase() {
        System.out.println("擦除圆形");
    }
}
