package com.linc.dp.p01;

/**
 * 单例模式实现类版本2：支持同步的版本一
 *
 * @Author Lin.C
 * @Date 2019/3/2 14:16
 */
public class SingletonV2 {

    // 1. 静态变量
    private static SingletonV2 singleton;

    // 2. 私有的构造方法
    private SingletonV2() {
    }

    // 3. public的get方法
    public synchronized static SingletonV2 getInstance() {
        if (null == singleton) {
            singleton = new SingletonV2();
        }
        return singleton;
    }

}