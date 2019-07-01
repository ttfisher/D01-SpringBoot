package com.linc.dp.Singleton;

/**
 * 双重检查锁式单例
 *
 * @author Lin.C
 * @date 2019/5/29 7:44
 */
public class SingletonTypeC {

    private static SingletonTypeC instance;

    private SingletonTypeC() {
    }

    /**
     * 获取实例方式1
     *
     * @return
     */
    public static SingletonTypeC getInstance() {
        if (null == instance) {
            synchronized (SingletonTypeC.class) {
                if (null == instance) {
                    instance = new SingletonTypeC();
                }

            }
        }
        return instance;
    }

    /**
     * 获取实例方式2
     *
     * @return
     */
    public static SingletonTypeC getInstancePlus() {
        if (null == instance) {
            SingletonTypeC temp;
            synchronized (SingletonTypeC.class) {
                temp = instance;
                if (null == instance) {
                    instance = new SingletonTypeC();
                    synchronized (SingletonTypeC.class) {
                        if (null == temp) {
                            temp = new SingletonTypeC();
                        }
                    }
                    instance = temp;
                }
            }
        }
        return instance;
    }
}
