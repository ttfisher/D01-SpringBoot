package com.linc.client;

import com.linc.dp.Prototype.PrototypeExt;

/**
 * 原型模式客户端（浅克隆）
 *
 * @author Lin.C
 * @date 2019/6/11 8:00
 */
public class PrototypeExtClient {

    public static void main(String[] args) {
        PrototypeExt prototypeExt = new PrototypeExt();

        prototypeExt.add("Jack");
        System.out.println(prototypeExt);

        PrototypeExt cloner = prototypeExt.clone();
        cloner.add("Rose");
        System.out.println(cloner);
    }
}
