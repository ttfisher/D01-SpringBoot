package com.linc.dp.AbstractFactory;

/**
 * 产品A
 *
 * @author Lin.C
 * @date 2019/5/27 7:46
 */
public class ConcreteAbstractProductBL1 implements AbstractProductB {

    @Override
    public void doSomething() {
        System.out.println("我是Abstract Product接口的实际产品-产品B-品类L1");
    }
}
