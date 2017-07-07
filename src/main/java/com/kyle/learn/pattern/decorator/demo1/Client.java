package com.kyle.learn.pattern.decorator.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:11:28
 */
public class Client {
    public static void main(String[] args) {
        Component windows = new Windows();
        Component scro = new ScrollbarDecorator(windows);

        scro.desplay();

    }
}
