package com.linc.dp.Builder;

/**
 * 建造者实现类
 *
 * @author Lin.C
 * @date 2019/5/31 7:24
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("partC");
    }
}
