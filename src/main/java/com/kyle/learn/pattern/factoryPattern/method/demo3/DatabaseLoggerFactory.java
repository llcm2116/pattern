package com.kyle.learn.pattern.factoryPattern.method.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-03-17:16:12
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
