package com.linc.client;

import com.linc.dp.Bridge.Abstraction;
import com.linc.dp.Bridge.ConcreteImplementorA;
import com.linc.dp.Bridge.ConcreteImplementorB;

/**
 * 桥接模式的客户调用
 *
 * @author Lin.C
 * @date 2019/6/11 7:45
 */
public class BridgeClient {

    public static void main(String[] args) {
        Abstraction abstractionA = new Abstraction(new ConcreteImplementorA());
        abstractionA.operation();

        Abstraction abstractionB = new Abstraction(new ConcreteImplementorB());
        abstractionB.operation();
    }
}
