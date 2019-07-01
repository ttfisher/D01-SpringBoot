package com.linc.dp.Singleton;

/**
 * 饿汉式单例
 *
 * @author Lin.C
 * @date 2019/5/28 7:44
 */
public class SingletonTypeA {

    private static SingletonTypeA instance = new SingletonTypeA();

    private SingletonTypeA() {
    }

    /**
     * 获取实例
     *
     * @return
     */
    public static SingletonTypeA getInstance() {
        return instance;
    }
}
