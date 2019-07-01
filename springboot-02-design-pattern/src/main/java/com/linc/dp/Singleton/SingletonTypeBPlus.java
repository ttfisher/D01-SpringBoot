package com.linc.dp.Singleton;

/**
 * 同步锁式单例
 *
 * @author Lin.C
 * @date 2019/5/29 7:24
 */
public class SingletonTypeBPlus {

    private static SingletonTypeBPlus instance;

    private SingletonTypeBPlus() {
    }

    /**
     * 获取实例
     *
     * @return
     */
    public static synchronized SingletonTypeBPlus getInstance() {
        if (null == instance) {
            // 为了加强多线程模拟的效果，否则线程运行太快无法演示出多线程时的效果（实际使用时不需要）
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonTypeBPlus();
        }
        return instance;
    }
}
