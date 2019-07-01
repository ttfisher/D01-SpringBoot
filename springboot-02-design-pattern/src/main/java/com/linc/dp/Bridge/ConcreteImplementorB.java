package com.linc.dp.Bridge;

/**
 * 实际操作实现类B
 *
 * @author Lin.C
 * @date 2019/6/11 7:41
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("I am operation implementor B, i am working.");
    }
}
