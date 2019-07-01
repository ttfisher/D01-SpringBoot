package com.linc.client;

import com.linc.dp.Decorator.Component;
import com.linc.dp.Decorator.ConcreteComponent;
import com.linc.dp.Decorator.ConcreteDecorator;

/**
 * 装饰器模式客户类
 *
 * @author Lin.C
 * @date 2019/6/11 9:02
 */
public class DecoratorClient {

    public static void main(String[] args) {
        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.operation();
    }
}
