package com.kyle.learn.pattern.factoryPattern.abs.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-18:18:45
 */
public interface PhoneFactory {
    Operation createOperation();

    Desktop createDesktop();
}
