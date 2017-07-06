package com.kyle.learn.pattern.composite.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:17:33
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile abstractFile);

    public abstract void remove(AbstractFile abstractFile);

    public abstract AbstractFile getChild(int i);

    public abstract void deleteVirus();
}
