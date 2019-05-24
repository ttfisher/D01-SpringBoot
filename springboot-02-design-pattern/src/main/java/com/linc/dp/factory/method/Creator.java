package com.linc.dp.factory.method;

/**
 * 工厂接口
 *
 * @author Lin.C
 * @date 2019/5/24 7:48
 */
public interface Creator {

    /**
     * 工厂方法
     *
     * @param productType
     */
    Product factoryMethod(String productType);

    /**
     * 其他操作
     */
    void anOperation();
}
