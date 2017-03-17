package com.kyle.learn.pattern.factory.method.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-17:17:39
 */
public class DatabaseLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }

    @Override
    public Logger createLogger(String str) {
        return new DatabaseLogger();
    }
}
