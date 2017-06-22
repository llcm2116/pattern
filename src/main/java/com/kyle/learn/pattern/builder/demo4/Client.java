package com.kyle.learn.pattern.builder.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:14:05
 */
public class Client {
    public static void main(String[] args) {
        PlayerBuilder builder = new NetworkBuilder();

        Player player = builder.construct();
        System.out.println(player.toString());
    }
}
