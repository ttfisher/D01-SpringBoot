package com.linc.dp.p01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单例模式不同实现类版本的测试程序
 *
 * @Author Lin.C
 * @Date 2019/3/2 14:09
 */
public class SingletonTest {

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("--------------- Test V1 ----------------");
        testV1();
        System.out.println("--------------- Test V2 ----------------");
        testV2();
    }

    /**
     * SingletonV1 Test
     */
    private static void testV1() {
        // SingletonV1 s = new SingletonV1(); // 这一行是会报错的，无法通过编译
        SingletonV1 instance1 = SingletonV1.getInstance();
        SingletonV1 instance2 = SingletonV1.getInstance();
        System.out.println("instance1 hashcode : " + instance1.hashCode());
        System.out.println("instance2 hashcode : " + instance2.hashCode());
        System.out.println(instance1 == instance2);
    }

    /**
     * SingletonV2 Test
     */
    private static void testV2() {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        int i = 0;
        while (i++ < 3) {
            threadPool.submit(() -> {
                SingletonV2 instance = SingletonV2.getInstance();
                SingletonTest testInstance = new SingletonTest();
                System.out.println("instance hashcode : " + instance.hashCode());
                System.out.println("testInstance hashcode : " + testInstance.hashCode());
            });
        }
        threadPool.shutdown();
    }
}
