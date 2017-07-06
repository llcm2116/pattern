package com.kyle.learn.pattern.bridge.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-26:18:44
 */
public abstract  class DB {
    protected  FileType fileType;
    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public abstract void export();
}
