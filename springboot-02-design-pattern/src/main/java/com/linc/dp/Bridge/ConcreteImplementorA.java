package com.linc.dp.Bridge;

/**
 * 实际操作实现类A
 *
 * @author Lin.C
 * @date 2019/6/11 7:41
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("I am operation implementor A, i am working.");
    }
}
