package com.linc.dp.Flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 *
 * @author Lin.C
 * @date 2019/6/13 7:15
 */
public class FlyweightFactory {

    // 享元管理池
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    /**
     * 获取一个享元角色对象
     *
     * @param extrinsic
     * @return
     */
    public static Flyweight getFlyweight(String extrinsic) {
        if (!pool.containsKey(extrinsic)) {
            pool.put(extrinsic, new ConcreteFlyweight(extrinsic));
            System.out.println("Create new Flyweight by " + extrinsic);
        } else {
            // 此处纯粹是为了演示需要的无效分支
            System.out.println("Use existing Flyweight by " + extrinsic);
        }
        return pool.get(extrinsic);
    }
}
