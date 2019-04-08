package com.example.designpatternsdemo.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * .FlyweightFactory 创建并管理flyweight对象。 确保合理地共享flyweight。当用户请求一个flyweight时，
 * FlyweightFactory对象提供一个已创建的实例或者创建一个（如果不存在的话）
 */
public class FlyweightFactory {
    private static Map flyweights = new HashMap();

    public FlyweightFactory(String arg) {
        flyweights.put(arg, new ConcreteFlyweight());
    }

    public static Flyweight getFlyweight(String key) {
        if (flyweights.get(key) == null) {
            flyweights.put(key, new ConcreteFlyweight());
        }
        return (Flyweight) flyweights.get(key);
    }

    public static int getSize() {
        return flyweights.size();
    }

}
