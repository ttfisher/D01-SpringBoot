package com.linc.client;

import com.linc.dp.Prototype.Prototype;

/**
 * 原型模式客户端
 *
 * @author Lin.C
 * @date 2019/5/31 8:00
 */
public class PrototypeClient {

    public static void main(String[] args) {
        Prototype prototype = new Prototype();

        Prototype b = prototype.clone();
        b.setName("B");
        System.out.println(b);

        Prototype c = prototype.clone();
        c.setName("C");
        System.out.println(c);
    }
}
