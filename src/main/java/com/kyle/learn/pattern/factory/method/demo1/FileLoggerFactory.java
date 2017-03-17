package com.kyle.learn.pattern.factory.method.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-17:17:37
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLog();
    }

    @Override
    public Logger createLogger(String str) {
        return new FileLog();
    }
}
