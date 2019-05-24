package com.linc.dp.factory.method;

/**
 * 默认产品
 *
 * @author Lin.C
 * @date 2019/5/24 7:46
 */
public class ConcreteProductDefault implements Product {

    @Override
    public void doSomething() {
        System.out.println("我是Product接口的默认产品。");
    }
}
