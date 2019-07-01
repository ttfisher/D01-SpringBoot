package com.linc.client;

import com.linc.dp.Builder.ConcreteBuilder;
import com.linc.dp.Builder.Director;

/**
 * 建造者模式客户端模拟
 *
 * @author Lin.C
 * @date 2019/5/31 7:26
 */
public class BuilderClient {

    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        System.out.println(director.construct());
    }
}
