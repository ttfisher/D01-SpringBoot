package com.linc.dp.FactoryMethod;

/**
 * 工厂接口
 *
 * @author Lin.C
 * @date 2019/5/28 7:48
 */
public interface Creator {

    /**
     * 工厂方法
     */
    Product factoryMethod();

    /**
     * 其他操作
     */
    void anOperation();
}
