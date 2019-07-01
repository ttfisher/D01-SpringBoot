package com.linc.client;

import com.linc.dp.ChainOfResponsibility.HandlerUtil;

/**
 * 责任链客户端
 *
 * @author Lin.C
 * @date 2019/6/14 7:31
 */
public class ChainOfResponsibilityClient {

    public static void main(String[] args) {
        HandlerUtil.doHandle("A");
        HandlerUtil.doHandle("B");
        HandlerUtil.doHandle("C");
    }
}
