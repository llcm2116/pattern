package com.kyle.learn.pattern.builder.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:13:58
 */
public class NetworkBuilder extends PlayerBuilder {
    @Override
    protected void buildMenu() {
        player.setMenu("文件 编辑 工具 帮助");
    }

    @Override
    protected void buildPlaylist() {
        player.setPlaylist("第一集 第二集 第三集");
    }

    @Override
    protected void buildWindow() {
        player.setWindow("全屏窗口");
    }

    @Override
    protected void buildControllerBar() {
        player.setControllerBar("播放 前进 后退 停止");
    }

    @Override
    protected void buildCollectlist() {
        player.setCollectlist("火影忍者 海贼王");
    }

    @Override
    protected boolean isNetworkModel() {
        return true;
    }
}
