package com.linc.client;

import com.linc.dp.Singleton.*;

/**
 * 单例模式的测试客户类
 *
 * @author Lin.C
 * @date 2019/5/30 7:53
 */
public class SingletonClient {

    public static void main(String[] args) {
        System.out.println("--------------- 饿汉式单例（单线程） ------------");
        for (int i = 0; i < 3; i++) {
            System.out.println(SingletonTypeA.getInstance().hashCode());
        }

        System.out.println("--------------- 懒汉式单例（多线程） ------------");
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println(SingletonTypeB.getInstance().hashCode())).start();
        }

        System.out.println("--------------- 懒汉式单例（单线程） ------------");
        for (int i = 0; i < 3; i++) {
            System.out.println(SingletonTypeB.getInstance().hashCode());
        }

        System.out.println("--------------- 同步锁式单例（多线程） ------------");
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println(SingletonTypeBPlus.getInstance().hashCode())).start();
        }

        System.out.println("--------------- 双重检查锁式单例（多线程） ------------");
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println(SingletonTypeC.getInstance().hashCode())).start();
        }
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println(SingletonTypeC.getInstancePlus().hashCode())).start();
        }

        System.out.println("--------------- 枚举式单例（多线程） ------------");
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println(SingletonTypeD.INSTANCE.hashCode())).start();
        }

        System.out.println("--------------- 静态内部类式单例（多线程） ------------");
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println(SingletonTypeE.getInstance().hashCode())).start();
        }
    }
}
