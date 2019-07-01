package com.linc.client;

import com.linc.dp.AbstractFactory.AbstractFactory;
import com.linc.dp.AbstractFactory.ConcreteFactoryX;
import com.linc.dp.AbstractFactory.ConcreteFactoryY;

/**
 * 抽象工厂模式的客户端
 *
 * @author Lin.C
 * @date 2019/5/27 7:54
 */
public class AbstractFactoryClient {

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        // 工厂X，分别生产对应的产品
        System.out.println("-------------X 工厂开始加入生产--------------");
        AbstractFactory factoryX = new ConcreteFactoryX();
        factoryX.createProductA().doSomething();
        factoryX.createProductB().doSomething();

        // 工厂Y，分别生产对应的产品
        System.out.println("-------------Y 工厂开始加入生产--------------");
        AbstractFactory factoryY = new ConcreteFactoryY();
        factoryY.createProductA().doSomething();
        factoryY.createProductB().doSomething();
    }
}
