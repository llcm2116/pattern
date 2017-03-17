package com.kyle.learn.pattern.factoryPattern.method.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-17:17:34
 */
public interface LoggerFactory {
    public Logger createLogger();

    public Logger createLogger(String str);
}
