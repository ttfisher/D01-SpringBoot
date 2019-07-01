package com.linc.dp.Singleton;

/**
 * 懒汉式单例
 *
 * @author Lin.C
 * @date 2019/5/28 7:44
 */
public class SingletonTypeB {

    private static SingletonTypeB instance;

    private SingletonTypeB() {
    }

    /**
     * 获取实例
     *
     * @return
     */
    public static SingletonTypeB getInstance() {
        if (null == instance) {
            // 为了加强多线程模拟的效果，否则线程运行太快无法演示出多线程时的效果（实际使用时不需要）
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonTypeB();
        }
        return instance;
    }
}
