package com.linc.client;

import com.linc.dp.Flyweight.Flyweight;
import com.linc.dp.Flyweight.FlyweightFactory;
import com.linc.dp.Flyweight.UnsharedConcreteFlyweight;

/**
 * 享元模式客户类
 *
 * @author Lin.C
 * @date 2019/6/13 7:19
 */
public class FlyweightClient {

    public static void main(String[] args) {
        int extrinsic = 10;

        System.out.println("-------------------------------------------------------");
        Flyweight flyweightX = FlyweightFactory.getFlyweight("X");
        flyweightX.operate(++extrinsic);

        System.out.println("-------------------------------------------------------");
        Flyweight flyweightY = FlyweightFactory.getFlyweight("Y");
        flyweightY.operate(++extrinsic);

        System.out.println("-------------------------------------------------------");
        Flyweight flyweightReX = FlyweightFactory.getFlyweight("X");
        flyweightReX.operate(++extrinsic);

        System.out.println("-------------------------------------------------------");
        Flyweight flyweightUnX = new UnsharedConcreteFlyweight("X");
        flyweightUnX.operate(++extrinsic);
    }
}
