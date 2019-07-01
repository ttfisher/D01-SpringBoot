package com.linc.dp.Builder;

/**
 * 建造者接口
 *
 * @author Lin.C
 * @date 2019/5/31 7:20
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
