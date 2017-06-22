package com.kyle.learn.pattern.builder.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:10:54
 */
public class ActorController {

    public Actor construct(ActorBuilder ab) {
        ab.buildCostume();
        ab.buildFace();
        ab.buildHairstyle();
        ab.buildSex();
        ab.buildType();

        return ab.createActor();
    }
}
