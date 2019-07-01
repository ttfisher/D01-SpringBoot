package com.linc.dp.AbstractFactory;

/**
 * 具体的工厂
 *
 * @author Lin.C
 * @date 2019/5/27 7:50
 */
public class ConcreteFactoryY implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteAbstractProductAL2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteAbstractProductBL2();
    }
}
