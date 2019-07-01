package com.linc.dp.Facade;

/**
 * 对外提供的服务（实际上也可以抽象一层接口，此处偷个懒）
 *
 * @author Lin.C
 * @date 2019/6/11 9:31
 */
public class Facade {

    private Component componentA;

    private Component componentB;

    public Facade() {
        componentA = new ConcreteComponentA();
        componentB = new ConcreteComponentB();
    }

    public void operationA() {
        componentA.operation();
    }

    public void operationB() {
        componentB.operation();
    }
}
