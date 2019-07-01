package com.linc.dp.FactoryMethod;

/**
 * 具体的工厂(工厂模式）
 *
 * @author Lin.C
 * @date 2019/5/28 7:50
 */
public class ConcreteCreatorB implements Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }

    @Override
    public void anOperation() {
        System.out.println("我是个独立的其他方法，比如可以告诉你我的地址是：南京市江宁区XXX街道XXX社区");
    }
}
