package com.kyle.learn.pattern.factory.method.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-03-17:16:11
 */
public class FileLoggerFactory extends LoggerFactory {
    public Logger createLogger() {
        return new FileLogger();
    }
}
