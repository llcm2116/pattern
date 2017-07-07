package com.kyle.learn.pattern.decorator.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-07:11:24
 */
public class ComponentDecorator extends Component {

    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void desplay() {
        component.desplay();
    }
}
