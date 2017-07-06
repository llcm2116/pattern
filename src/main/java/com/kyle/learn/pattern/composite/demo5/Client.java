package com.kyle.learn.pattern.composite.demo5;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:18:34
 */
public class Client {

    public static void main(String[] args) {
        Container control = new Container("组件库");


        Container container1 = new Container("窗体");
        Container container2 = new Container("控制面板");

        Entity entity1 = new Entity("按钮1");
        Entity entity2 = new Entity("按钮2");
        Entity entity3 = new Entity("文本1");
        Entity entity4 = new Entity("文本2");

        container1.add(entity1);
        container1.add(entity3);
        container2.add(entity2);
        container2.add(entity4);

        control.add(container1);
        control.add(container2);

        control.service();
    }

}
