package com.linc.client;

import com.linc.dp.Proxy.Proxy;
import com.linc.dp.Proxy.RealSubject;
import com.linc.dp.Proxy.Subject;

/**
 * 代理模式客户类
 *
 * @author Lin.C
 * @date 2019/6/13 8:06
 */
public class ProxyClient {

    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }
}
