package com.kyle.learn.pattern.builder.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:10:48
 */
public class HeroBuilder extends ActorBuilder {

    @Override
    protected void buildType() {
        actor.setType("李逍遥");
    }

    @Override
    protected void buildSex() {
        actor.setSex("男");
    }

    @Override
    protected void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    protected void buildCostume() {
        actor.setCostume("玄武战袍");
    }

    @Override
    protected void buildHairstyle() {
        actor.setHairstyle("飘逸侠客刘海");
    }
}
