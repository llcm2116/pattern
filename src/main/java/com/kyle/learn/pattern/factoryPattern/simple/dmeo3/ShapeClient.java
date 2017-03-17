package com.kyle.learn.pattern.factoryPattern.simple.dmeo3;


/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-10:18:25
 */
public class ShapeClient {
    public static void main(String[] args) throws Exception {
        Shape shape = Shape.getShape("round");
        shape.draw();
        shape.erase();
    }
}
