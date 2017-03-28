package com.kyle.learn.pattern.factory.abs.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-03-28:10:41
 */
public class HuaWeiMobile implements Mobile {
    @Override
    public void call() {
        System.out.println("华为手机真的不错，用的很舒服");
    }
}
