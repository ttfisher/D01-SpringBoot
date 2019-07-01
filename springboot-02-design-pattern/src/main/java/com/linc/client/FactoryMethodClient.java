package com.linc.client;


import com.linc.dp.FactoryMethod.ConcreteCreatorA;
import com.linc.dp.FactoryMethod.ConcreteCreatorB;
import com.linc.dp.FactoryMethod.Creator;

/**
 * 工厂模式的客户端
 *
 * @author Lin.C
 * @date 2019/5/28 7:54
 */
public class FactoryMethodClient {

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        // 1. 创建一个工厂A
        Creator creatorA = new ConcreteCreatorA();
        // 2. 生产A产品
        creatorA.factoryMethod().doSomething();

        // 1. 创建一个工厂
        Creator creatorB = new ConcreteCreatorB();
        // 2. 生产B产品
        creatorB.factoryMethod().doSomething();
    }
}
