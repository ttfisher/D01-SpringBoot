package com.linc.client;

import com.linc.dp.Facade.Facade;

/**
 * 客户类
 *
 * @author Lin.C
 * @date 2019/6/11 9:36
 */
public class FacadeClient {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operationA();
        facade.operationB();
    }
}
