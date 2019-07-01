package com.linc.client;

import com.linc.dp.Adaptor.Adaptor;
import com.linc.dp.Adaptor.ConcreteAdaptor;

/**
 * 适配器模式客户端
 *
 * @author Lin.C
 * @date 2019/6/3 7:51
 */
public class AdaptorClient {

    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args) {
        Adaptor adaptor = new ConcreteAdaptor();
        adaptor.operation();
    }
}
