package com.linc.dp.ChainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象处理者
 *
 * @author Lin.C
 * @date 2019/6/14 7:22
 */
public abstract class Handler {

    @Getter
    @Setter
    private Handler next;

    /**
     * 处理请求的抽象方法
     *
     * @param request
     */
    public abstract void handleRequest(String request);
}