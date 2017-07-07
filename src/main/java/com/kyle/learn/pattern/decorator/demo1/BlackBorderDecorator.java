package com.kyle.learn.pattern.decorator.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:11:27
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void desplay() {
        super.desplay();
        setBlackBorder();
    }

    public void setBlackBorder() {
        System.out.println("增加黑色边框");
    }
}
