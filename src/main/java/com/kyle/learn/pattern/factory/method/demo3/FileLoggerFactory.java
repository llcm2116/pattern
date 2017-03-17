package com.kyle.learn.pattern.factory.method.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-03-17:16:11
 */
public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new FileLogger();
    }
}
