package com.linc.dp.client;

import com.linc.dp.factory.method.ConcreteCreator;
import com.linc.dp.factory.method.Creator;

/**
 * 工厂模式的客户端
 *
 * @author Lin.C
 * @date 2019/5/24 7:54
 */
public class FactoryMethodClient {

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        // 1. 创建一个工厂
        Creator creator = new ConcreteCreator();
        // 2. 生产A产品
        creator.factoryMethod("A").doSomething();
        // 3. 生产B产品
        creator.factoryMethod("B").doSomething();
        // 4. 生产X产品（不存在）
        creator.factoryMethod("X").doSomething();
        // 5. 工厂的其他操作
        creator.anOperation();
    }
}
