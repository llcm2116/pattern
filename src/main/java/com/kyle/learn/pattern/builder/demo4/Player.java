package com.kyle.learn.pattern.builder.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:13:47
 */
public class Player {
    private String menu;
    private String playlist;
    private String window;
    private String controllerBar;
    private String collectlist;


    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getControllerBar() {
        return controllerBar;
    }

    public void setControllerBar(String controllerBar) {
        this.controllerBar = controllerBar;
    }

    public String getCollectlist() {
        return collectlist;
    }

    public void setCollectlist(String collectlist) {
        this.collectlist = collectlist;
    }

    @Override
    public String toString() {
        return "Player{" +
                "menu='" + menu + '\'' +
                ", playlist='" + playlist + '\'' +
                ", window='" + window + '\'' +
                ", controllerBar='" + controllerBar + '\'' +
                ", collectlist='" + collectlist + '\'' +
                '}';
    }
}
