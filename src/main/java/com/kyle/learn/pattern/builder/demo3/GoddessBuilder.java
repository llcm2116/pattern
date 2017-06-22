package com.kyle.learn.pattern.builder.demo3;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:10:48
 */
public class GoddessBuilder extends ActorBuilder {

    @Override
    protected void buildType() {
        actor.setType("赵灵儿");
    }

    @Override
    protected void buildSex() {
        actor.setSex("女");
    }

    @Override
    protected void buildFace() {
        actor.setFace("美丽");
    }

    @Override
    protected void buildCostume() {
        actor.setCostume("青龙宝甲");
    }

    @Override
    protected void buildHairstyle() {
        actor.setHairstyle("双马尾");
    }
}
