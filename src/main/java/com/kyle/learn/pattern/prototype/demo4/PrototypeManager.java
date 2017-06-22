package com.kyle.learn.pattern.prototype.demo4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-19:16:56
 */
public class PrototypeManager {

    public static Map<String, Prototype> map = new HashMap<String, Prototype>();

    private PrototypeManager() {
        map.put("bussiness1", new Bussiness1());
        map.put("bussiness2", new Bussiness2());
    }

    public void setPrototype(String key, Prototype prototype) {
        map.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        return (Prototype) map.get(key).clone();
    }

    public static PrototypeManager getInstance() {
        return Inner.instance;
    }


    private static class Inner {
        private static final PrototypeManager instance = new PrototypeManager();
    }
}
