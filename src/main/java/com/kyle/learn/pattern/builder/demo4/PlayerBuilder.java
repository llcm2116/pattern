package com.kyle.learn.pattern.builder.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:13:49
 */
public abstract class PlayerBuilder {
    protected Player player = new Player();

    protected abstract void buildMenu();

    protected abstract void buildPlaylist();

    protected abstract void buildWindow();

    protected abstract void buildControllerBar();

    protected abstract void buildCollectlist();

    protected boolean isComplateModel() {
        return false;
    }

    protected boolean isStreamlineModel() {
        return false;
    }

    protected boolean isMemoryModel() {
        return false;
    }

    protected boolean isNetworkModel() {
        return false;
    }

    public Player construct() {
        if (isComplateModel()) {
            buildCollectlist();
            buildControllerBar();
            buildMenu();
            buildPlaylist();
            buildWindow();
        }

        if (isStreamlineModel()) {
            buildWindow();
            buildControllerBar();
        }

        if (isMemoryModel()) {
            buildControllerBar();
            buildWindow();
            buildCollectlist();
        }

        if (isNetworkModel()) {
            buildWindow();
            buildMenu();
            buildControllerBar();
        }

        return player;
    }
}
