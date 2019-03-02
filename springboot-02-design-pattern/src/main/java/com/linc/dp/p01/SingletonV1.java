package com.linc.dp.p01;

/**
 * 单例模式实现类版本1：常规实现
 *
 * @Author Lin.C
 * @Date 2019/3/2 13:51
 */
public class SingletonV1 {

    // 1. 静态变量
    private static SingletonV1 singleton;

    // 2. 私有的构造方法
    private SingletonV1() {
    }

    // 3. public的get方法
    public static SingletonV1 getInstance() {
        if (null == singleton) {
            singleton = new SingletonV1();
        }
        return singleton;
    }
}
