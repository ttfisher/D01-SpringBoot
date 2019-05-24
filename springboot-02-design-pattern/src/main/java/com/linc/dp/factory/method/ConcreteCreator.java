package com.linc.dp.factory.method;

/**
 * 具体的工厂
 *
 * @author Lin.C
 * @date 2019/5/24 7:50
 */
public class ConcreteCreator implements Creator {

    @Override
    public Product factoryMethod(String productType) {
        switch (productType) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductA();
            default:
                break;
        }
        return new ConcreteProductDefault();
    }

    @Override
    public void anOperation() {
        System.out.println("我是个独立的其他方法，比如可以告诉你我的地址是：南京市江宁区XXX街道XXX社区");
    }
}
