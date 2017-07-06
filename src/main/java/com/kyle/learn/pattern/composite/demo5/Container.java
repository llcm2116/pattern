package com.kyle.learn.pattern.composite.demo5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:18:30
 */
public class Container extends Control {
    private String name;
    private List<Control> list = new ArrayList<Control>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Control control) {
        list.add(control);
    }

    public void remove(Control control) {
        list.remove(control);
    }

    public Control getChild(int i) {
        return list.get(i);
    }

    public Container(String name) {
        this.name = name;
    }

    @Override
    public void service() {
        System.out.println("容器 " + name + " 内控件开始工作");

        for (Control control : list) {
            control.service();
        }
    }
}
