package com.linc.dp.AbstractFactory;

/**
 * 抽象工厂接口
 *
 * @author Lin.C
 * @date 2019/5/27 7:48
 */
public interface AbstractFactory {

    /**
     * 产品A工厂
     */
    AbstractProductA createProductA();

    /**
     * 产品B的工厂
     */
    AbstractProductB createProductB();
}
