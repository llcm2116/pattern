package com.kyle.learn.pattern.factoryPattern.simple.demo2;

/**
 * Created with IntelliJ IDEA.
 * User:
 * Date: 2017-01-10:18:13
 */
public class ShapeFactory {

    public static Shape getShape(String type) throws Exception {
        String clzz = XMLUtil.getBeans(type);
        Shape shape = (Shape) Class.forName(clzz).newInstance();

        return shape;
    }
}
