package com.kyle.learn.pattern.factory.method.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-17:17:34
 */
public abstract class LoggerFactory {

    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();

    public abstract Logger createLogger(String str);
}
