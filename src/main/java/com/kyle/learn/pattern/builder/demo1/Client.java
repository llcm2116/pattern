package com.kyle.learn.pattern.builder.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-22:10:57
 */
public class Client {
    public static void main(String[] args) {
        ActorBuilder actorBuilder = new DevilBuilder();
        ActorController actorController = new ActorController();

        Actor actor = actorController.construct(actorBuilder);
        System.out.println(actor.toString());
    }
}
