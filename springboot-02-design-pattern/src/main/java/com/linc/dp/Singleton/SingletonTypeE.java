package com.linc.dp.Singleton;

/**
 * 静态内部类式单例
 *
 * @author Lin.C
 * @date 2019/5/29 7:44
 */
public class SingletonTypeE {

    private SingletonTypeE() {
    }

    public static class inner {
        public static final SingletonTypeE instance = new SingletonTypeE();
    }

    /**
     * 获取实例
     *
     * @return
     */
    public static SingletonTypeE getInstance() {
        return inner.instance;
    }
}
