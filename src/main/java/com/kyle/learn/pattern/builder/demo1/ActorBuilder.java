package com.kyle.learn.pattern.builder.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:10:45
 */
public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    protected abstract void buildType();

    protected abstract void buildSex();

    protected abstract void buildFace();

    protected abstract void buildCostume();

    protected abstract void buildHairstyle();

    protected Actor createActor() {
        return actor;
    }
}
