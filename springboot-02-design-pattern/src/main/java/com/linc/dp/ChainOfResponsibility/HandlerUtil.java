package com.linc.dp.ChainOfResponsibility;

/**
 * 工具类
 *
 * @author Lin.C
 * @date 2019/6/14 7:29
 */
public class HandlerUtil {

    /**
     * 对外提供的处理方法
     *
     * @param request
     */
    public static void doHandle(String request) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest(request);
    }
}
