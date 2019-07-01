package com.linc.dp.Bridge;

/**
 * 桥
 *
 * @author Lin.C
 * @date 2019/6/11 7:41
 */
public class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImpl();
    }
}
