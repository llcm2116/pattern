package com.kyle.learn.pattern.builder.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:10:48
 */
public class DevilBuilder extends ActorBuilder {

    @Override
    protected void buildType() {
        actor.setType("拜月教主");
    }

    @Override
    protected void buildSex() {
        actor.setSex("男");
    }

    @Override
    protected void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    protected void buildCostume() {
        actor.setCostume("赤月魔袍");
    }

    @Override
    protected void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
