package com.kyle.learn.pattern.decorator.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:11:25
 */
public class ScrollbarDecorator extends ComponentDecorator {
    public ScrollbarDecorator(Component component) {
        super(component);
    }

    @Override
    public void desplay() {
        super.desplay();
        setScrollbar();
    }

    public void setScrollbar() {
        System.out.println("添加滚动条");
    }
}
