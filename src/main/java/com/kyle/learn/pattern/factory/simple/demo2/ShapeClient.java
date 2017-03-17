package com.kyle.learn.pattern.factory.simple.demo2;


/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-10:18:25
 */
public class ShapeClient {
    public static void main(String[] args) throws Exception {
        Shape shape = ShapeFactory.getShape("round");
        shape.draw();
        shape.erase();
    }
}
