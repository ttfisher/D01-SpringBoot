package com.linc.dp.Adaptor;

/**
 * 被适配的实体定义
 *
 * @author Lin.C
 * @date 2019/6/3 7:50
 */
public class Adaptee {

    /**
     * 既有组件的传统操作
     */
    public void adaptedOperation() {
        System.out.println("I am operation from adaptee.");
    }
}
