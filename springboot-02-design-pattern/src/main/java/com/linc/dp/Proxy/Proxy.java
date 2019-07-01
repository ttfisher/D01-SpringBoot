package com.linc.dp.Proxy;

/**
 * 代理
 *
 * @author Lin.C
 * @date 2019/6/13 8:03
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("I am Proxy starting");
        realSubject.request();
        System.out.println("I am Proxy ending");

    }
}
