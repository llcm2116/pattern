package com.kyle.learn.pattern.factory.simple.dmeo3;


/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-10:18:11
 */
public class SquareShape extends Shape {

    public SquareShape(){
        System.out.println("初始化正方形");
    }

    public void draw() {
        System.out.println("绘制正方形");
    }

    public void erase() {
        System.out.println("擦除正方形");
    }
}
