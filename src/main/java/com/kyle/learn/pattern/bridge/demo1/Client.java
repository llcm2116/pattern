package com.kyle.learn.pattern.bridge.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-26:18:30
 */
public class Client {
    public static void main(String[] args) {
        ImageImpl impl = new LinuxImpl();

        Image image = new GIFImage();

        image.setImpl(impl);

        image.parseFile();
    }
}
