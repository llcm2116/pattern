package com.kyle.learn.pattern.factory.method.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-03-17:16:12
 */
public class DatabaseLoggerFactory extends LoggerFactory {

    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
