package com.linc.dp.Proxy;

/**
 * 被代理者
 *
 * @author Lin.C
 * @date 2019/6/13 8:02
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("I am RealSubject dealing request.");
    }
}
