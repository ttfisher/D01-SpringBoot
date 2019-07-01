package com.linc.dp.FactoryMethodSimple;

/**
 * 产品A
 *
 * @author Lin.C
 * @date 2019/5/24 7:46
 */
public class ConcreteProductA implements Product {

    @Override
    public void doSomething() {
        System.out.println("我是Product接口的实际产品A");
    }
}
