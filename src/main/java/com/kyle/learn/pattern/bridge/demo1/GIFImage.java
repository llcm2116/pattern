package com.kyle.learn.pattern.bridge.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-26:18:24
 */
public class GIFImage extends Image {
    @Override
    public void parseFile() {

        impl.show();

        System.out.println("gif");
    }
}
